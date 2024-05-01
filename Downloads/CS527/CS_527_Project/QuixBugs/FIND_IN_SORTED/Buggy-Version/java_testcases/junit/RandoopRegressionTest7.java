import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3501");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3502");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3503");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3504");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3505");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3506");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3507");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3508");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3509");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3510");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3511");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3512");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3513");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3514");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 100, (int) (short) -1, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (-1), (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3515");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3516");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3517");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) -1, (int) (short) -1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3518");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3519");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) '#');
        int int9 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (byte) 0);
        int int13 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) '4', (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) (short) 1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3520");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3521");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3522");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3523");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3524");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3525");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3526");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3527");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3528");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3529");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) '#', (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3530");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 100, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3531");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3532");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) ' ', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 1, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3533");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3534");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3535");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3536");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3537");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3538");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3539");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3540");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3541");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3542");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3543");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3544");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3545");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3546");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3547");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 1, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3548");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (-1), (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3549");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3550");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3551");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3552");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3553");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3554");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 3, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3555");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3556");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3557");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3558");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3559");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3560");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3561");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3562");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3563");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3564");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3565");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3566");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3567");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3568");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3569");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3570");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3571");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) '#', (int) (byte) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (-1), (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3572");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3573");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3574");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3575");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3576");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3577");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3578");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3579");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3580");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3581");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3582");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3583");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3584");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3585");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3586");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (-1), (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3587");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3588");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 100, (int) (short) 100);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3589");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3590");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3591");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3592");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3593");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 10, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3594");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3595");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3596");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3597");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3598");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3599");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3600");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3601");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, (int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3602");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3603");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3604");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 100, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3605");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3606");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3607");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3608");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3609");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3610");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3611");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3612");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3613");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3614");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3615");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3616");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3617");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3618");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3619");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3620");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3621");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) 'a', (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3622");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3623");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3624");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3625");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3626");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3627");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3628");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3629");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3630");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3631");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3632");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) -1, (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3633");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3634");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (byte) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3635");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3636");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3637");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 3, 0, 3);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3638");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3639");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3640");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3641");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3642");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3643");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (short) 1, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3644");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3645");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3646");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3647");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3648");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3649");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3650");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 100, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3651");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3652");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3653");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3654");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3655");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 1, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3656");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3657");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3658");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3659");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 10, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3660");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3661");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3662");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3663");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3664");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3665");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3666");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (-1), (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3667");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3668");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3669");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3670");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3671");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 10, (int) (short) 1, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3672");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3673");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3674");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 2, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3675");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3676");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (byte) 10, (int) (short) 1, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3677");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3678");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3679");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3680");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3681");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, 1, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 10);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3682");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 0, (-1), (-1));
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) '#', 2, 2);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3683");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3684");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3685");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3686");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 10, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3687");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) 1, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3688");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3689");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3690");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3691");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (byte) -1, (-1));
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3692");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) ' ', (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3693");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3694");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3695");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3696");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3697");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3698");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 10, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3699");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3700");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 100, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3701");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3702");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3703");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3704");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3705");
        int[] intArray6 = new int[] { (short) 1, 2, 1, (byte) 0, (short) -1, (byte) 0 };
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (short) 1, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 2, 1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3706");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3707");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3708");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3709");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3710");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3711");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3712");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3713");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3714");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) -1, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3715");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3716");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3717");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3718");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3719");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3720");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3721");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int9 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, 0);
        int int11 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) ' ', 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3722");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3723");
        int[] intArray0 = null;
        int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3724");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3725");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3726");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3727");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3728");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3729");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3730");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3731");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3732");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3733");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3734");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3735");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3736");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3737");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3738");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3739");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3740");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3741");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3742");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) '#');
        int int9 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3743");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3744");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3745");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 10, 0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3746");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3747");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) '#', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3748");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3749");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3750");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3751");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3752");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3753");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3754");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) '#', (int) (byte) 0, 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 2, (-1), (-1));
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3755");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3756");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3757");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3758");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3759");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3760");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3761");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3762");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3763");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3764");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) ' ', (int) ' ');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3765");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3766");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) -1, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3767");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 3, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3768");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3769");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3770");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3771");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3772");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3773");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3774");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3775");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3776");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3777");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int6 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 1, 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (-1), (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3778");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3779");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3780");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) '#');
        int int9 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (byte) 0);
        int int13 = java_programs.FIND_IN_SORTED.binsearch(intArray3, (int) '4', (-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3781");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3782");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3783");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 5, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3784");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3785");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3786");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3787");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3788");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3789");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3790");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3791");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3792");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3793");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3794");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3795");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3796");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3797");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3798");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3799");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3800");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) 'a', (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3801");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3802");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3803");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3804");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3805");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3806");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3807");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (short) 1, 1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3808");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3809");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3810");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3811");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3812");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3813");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3814");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3815");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3816");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3817");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3818");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3819");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3820");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, '#' };
        int int5 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (-1));
        int int7 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) -1);
        int int9 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) 0);
        int int11 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 35]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3821");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3822");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3823");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 100, 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3824");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3825");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3826");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3827");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3828");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3829");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3830");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3831");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3832");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3833");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3834");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 3, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3835");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3836");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3837");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 1, (int) (byte) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3838");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3839");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) 0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3840");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3841");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int30 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3842");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3843");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3844");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3845");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3846");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 1, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3847");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3848");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3849");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3850");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3851");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3852");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3853");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3854");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3855");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3856");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3857");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3858");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, 10, (int) (short) 10);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3859");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3860");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (byte) -1, (-1));
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass29 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3861");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (-1), (int) '#', (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3862");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3863");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3864");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3865");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, 3, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3866");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', 0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3867");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3868");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', (int) 'a', (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3869");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3870");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3871");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3872");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3873");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 3, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3874");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3875");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3876");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3877");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3878");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3879");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray4, 1, (int) (short) 1, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3880");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3881");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3882");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3883");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3884");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) 10, (int) (short) 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 2, (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3885");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3886");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3887");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3888");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3889");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 10, 10);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3890");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3891");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3892");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 1, 0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3893");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3894");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3895");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 100, 0, (int) (short) 0);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3896");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, (int) (byte) 10, 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3897");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3898");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3899");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3900");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3901");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3902");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3903");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3904");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int18 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, 3, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3905");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 10, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3906");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3907");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3908");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 100, (int) (short) -1, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3909");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 10, (int) (short) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3910");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3911");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 100);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3912");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, 0, (int) (short) 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3913");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3914");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 1);
        int int8 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '#', (int) (short) 10, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 100);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3915");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (int) (short) 0, (int) (byte) 1, 3);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) -1);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = java_programs.FIND_IN_SORTED.binsearch(intArray4, (-1), (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3916");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3917");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3918");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 10, (int) (byte) 1, 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 0);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3919");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 1, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3920");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int10 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) 0, (int) (short) 0, 0);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int16 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (short) -1, (int) 'a', (int) 'a');
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3921");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) 'a', (int) (byte) 100, (int) (byte) 100);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '4');
        int int20 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int22 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int24 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int26 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 2);
        int int28 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3922");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int12 = java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 0, 0, (int) (short) 0);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) ' ');
        int int20 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 10, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3923");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 1, 10 };
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 10);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, 1);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (short) 1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35, 1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest7.test3924");
        int[] intArray0 = new int[] {};
        int int2 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        int int4 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int6 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int8 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (short) 0);
        int int10 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int12 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) -1);
        int int14 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int16 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 3);
        int int18 = java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = java_programs.FIND_IN_SORTED.binsearch(intArray0, 3, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }
}


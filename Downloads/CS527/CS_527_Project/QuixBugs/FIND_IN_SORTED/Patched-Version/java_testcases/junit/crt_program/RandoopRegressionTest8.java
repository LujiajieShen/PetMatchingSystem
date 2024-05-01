import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4001");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4002");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, (int) (byte) 1, (int) (short) 10);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4003");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4004");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4005");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, (int) (short) 0, (int) 'a');
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
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4006");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (byte) -1, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4007");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (-1), (-1));
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4008");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4009");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (-1), 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', 0, 2);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4010");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (byte) 1, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4011");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4012");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
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
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4013");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4014");
        int[] intArray0 = null;
        int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) 1, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4015");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', 0, 2);
        int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, 0, 4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4016");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4017");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4018");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 0, (int) (byte) 100, 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4019");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 4, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4020");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 0, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 0, 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4021");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4022");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4023");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) ' ', (int) (byte) 0, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 1, 2, 5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4024");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4025");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, (int) (byte) 0, 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4026");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (short) 0, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4027");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 3, (int) (byte) 10, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4028");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 10, 0, (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4029");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 1, (int) (byte) 0, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4030");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4031");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, 0, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 1, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
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
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4032");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, 0, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 5, 0, (int) (short) 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4033");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 0, 4, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4034");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4035");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4036");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4037");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) '4', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4038");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4039");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4040");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4041");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 100, 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 1, 2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 2, (int) (short) 100, 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4042");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 3, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) 1, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) '#', (int) (short) 0, (int) (byte) 1);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 100, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4043");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 100, (int) (byte) 100, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4044");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4045");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4046");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) (short) 0, 2);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4047");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (short) -1, (int) (short) -1);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4048");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) 1, 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 10, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4049");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 100, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4050");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) -1, (-1));
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int38 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4051");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4052");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 1, 4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4053");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int7 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) '4');
        int int9 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4054");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (-1), 3);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, 4, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4055");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (short) 10, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 2, (int) (byte) 100, (int) (short) 100);
        int int32 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int34 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4056");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4057");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (byte) 100, 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 10, (-1), 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 10, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4058");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4059");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4060");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '#');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4061");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 3, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4062");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (-1), (int) (short) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 3);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) -1, (int) (byte) 1, (int) (short) -1);
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (int) (byte) 0, 2);
        int int36 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4063");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 100, 0, (int) (short) 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 100, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4064");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) '#');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) (byte) -1, 2, 0);
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
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4065");
        int[] intArray0 = new int[] {};
        int int2 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, 4, 10, (int) (byte) -1);
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
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4066");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray0, (int) ' ', (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4067");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, (int) (short) 0);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '#', (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4068");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 4, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4069");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 1);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4070");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (short) 0, (int) 'a', (int) 'a');
        int int24 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, 10, (int) (short) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 5, (int) (short) 100, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4071");
        int[] intArray1 = new int[] { 1 };
        int int5 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, (int) (short) 0, (int) (short) 10, (int) (byte) 10);
        int int9 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 100, (int) (short) 10, (int) (short) 10);
        int int11 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 1);
        int int13 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 0);
        int int15 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, (int) (short) 1);
        int int17 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray1, 10, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4072");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) 'a', (int) (byte) 1, (int) (short) 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 5);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4073");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 0, (int) (short) 10, (int) (short) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) ' ', (int) (short) 0, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4074");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (-1), (int) (byte) 0, (int) (short) 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) '4', (int) (byte) 100, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4075");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '#');
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
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
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4076");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 0, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4077");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int18 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, (int) (byte) 100, (int) (short) 0, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4078");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int int4 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 100);
        int int6 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) '4');
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (-1));
        int int22 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, (int) (short) 1, 0, (int) (short) 1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int28 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray2, 4);
        int int32 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray2, 4, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4079");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int12 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) '4');
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4080");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        int int8 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 100);
        int int10 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int14 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 1, (int) (short) -1, 10);
        int int16 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 10);
        int int18 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 0);
        int int20 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (short) 100);
        int int22 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, 1);
        int int28 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, (int) (byte) -1, (int) (short) 10);
        int int30 = correct_java_programs.FIND_IN_SORTED.find_in_sorted(intArray6, (-1));
        int int34 = correct_java_programs.FIND_IN_SORTED.binsearch(intArray6, 10, 3, 0);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 32, 97, 100, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }
}


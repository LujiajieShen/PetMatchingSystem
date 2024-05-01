import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3001");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3002");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3003");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3004");
        int[] intArray1 = new int[] { ' ' };
        int int3 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) -1);
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3005");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3006");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3007");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3008");
        int[] intArray3 = new int[] { 0, (byte) 10, 'a' };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3009");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3010");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3011");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3012");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3013");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3014");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3015");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3016");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3017");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3018");
        int[] intArray4 = new int[] { 'a', (short) 100, 1, 0 };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3019");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3020");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3021");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3022");
        int[] intArray1 = new int[] { ' ' };
        int int3 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) -1);
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3023");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3024");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3025");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3026");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3027");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3028");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3029");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3030");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3031");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3032");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3033");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3034");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3035");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3036");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3037");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3038");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3039");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3040");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3041");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3042");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3043");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3044");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3045");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3046");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3047");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3048");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3049");
        int[] intArray4 = new int[] { 'a', (short) 100, 1, 0 };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3050");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3051");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3052");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3053");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3054");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3055");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass30 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3056");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3057");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3058");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3059");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3060");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3061");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3062");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3063");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3064");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3065");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3066");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3067");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3068");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3069");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3070");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3071");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3072");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3073");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3074");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3075");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3076");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3077");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3078");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3079");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3080");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3081");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3082");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3083");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3084");
        int[] intArray1 = new int[] { (byte) -1 };
        int int3 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (-1));
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3085");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3086");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3087");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3088");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3089");
        int[] intArray4 = new int[] { 'a', (short) 100, 1, 0 };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3090");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3091");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3092");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3093");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3094");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3095");
        int[] intArray2 = new int[] { 'a', (byte) 100 };
        int int4 = java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3096");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3097");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3098");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3099");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3100");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3101");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3102");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3103");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3104");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3105");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3106");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3107");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3108");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3109");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3110");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int30 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3111");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3112");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3113");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3114");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3115");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3116");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3117");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3118");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3119");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3120");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3121");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3122");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3123");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int30 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int32 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3124");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3125");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3126");
        int[] intArray1 = new int[] { ' ' };
        int int3 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) -1);
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3127");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3128");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3129");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3130");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3131");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3132");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3133");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3134");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3135");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3136");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3137");
        int[] intArray4 = new int[] { 'a', (short) 100, 1, 0 };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3138");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3139");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3140");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3141");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3142");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int30 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int32 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3143");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3144");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3145");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3146");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3147");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3148");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3149");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3150");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3151");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3152");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3153");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3154");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3155");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3156");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3157");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3158");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3159");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3160");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3161");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3162");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3163");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3164");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3165");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3166");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3167");
        int[] intArray4 = new int[] { 'a', (short) 100, 1, 0 };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3168");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3169");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3170");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3171");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3172");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3173");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3174");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3175");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3176");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3177");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3178");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3179");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3180");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3181");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3182");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3183");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3184");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3185");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3186");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int30 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3187");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3188");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3189");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3190");
        int[] intArray1 = new int[] { ' ' };
        int int3 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) -1);
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3191");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3192");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3193");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3194");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3195");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3196");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3197");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3198");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3199");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3200");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3201");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3202");
        int[] intArray1 = new int[] { ' ' };
        int int3 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) -1);
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3203");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3204");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3205");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3206");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3207");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3208");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3209");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int31 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3210");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3211");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3212");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3213");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3214");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3215");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3216");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3217");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3218");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3219");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3220");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3221");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3222");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3223");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3224");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3225");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3226");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3227");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3228");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3229");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3230");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3231");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3232");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3233");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3234");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3235");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3236");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3237");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3238");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3239");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3240");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3241");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3242");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3243");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3244");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3245");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3246");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3247");
        int[] intArray3 = new int[] { 0, (byte) 10, 'a' };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3248");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3249");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3250");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3251");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3252");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3253");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3254");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3255");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3256");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int29 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3257");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3258");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3259");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3260");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3261");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3262");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3263");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3264");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3265");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3266");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3267");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, 'a' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3268");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3269");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3270");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3271");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3272");
        int[] intArray5 = new int[] { 1, (short) -1, (byte) 10, 0, 1 };
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray5, (int) (short) -1);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray5, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray5, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3273");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3274");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3275");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3276");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, 'a', (byte) -1, (byte) 100 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) -1);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        int int24 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int26 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) 0);
        int int28 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 97, -1, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3277");
        int[] intArray4 = new int[] { (-1), ' ', ' ', '#' };
        int int6 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (int) (byte) -1);
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, (-1));
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 32, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3278");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3279");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3280");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (-1));
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3281");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3282");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3283");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int16 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int18 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int20 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        int int22 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (-1));
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3284");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3285");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 1, ' ', (short) 100, (short) 1 };
        int int8 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int10 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int12 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (short) 0);
        int int14 = java_programs.POSSIBLE_CHANGE.possible_change(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 32, 100, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3286");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3287");
        int[] intArray3 = new int[] { 'a', 'a', (short) 10 };
        int int5 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int7 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int9 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int11 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) 0);
        int int13 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) -1);
        int int15 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int17 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int19 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int21 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, 0);
        int int23 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int25 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (byte) -1);
        int int27 = java_programs.POSSIBLE_CHANGE.possible_change(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }
}


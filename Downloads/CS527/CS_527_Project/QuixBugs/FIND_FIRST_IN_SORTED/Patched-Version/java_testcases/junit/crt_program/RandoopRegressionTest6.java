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
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3002");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3003");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3004");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3005");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3006");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3007");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3008");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3009");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3010");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3011");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3012");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3013");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3014");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3015");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3016");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3017");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3018");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3019");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3020");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3021");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3022");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3023");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3024");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3025");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3026");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3027");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3028");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3029");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int36 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int38 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3030");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3031");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3032");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3033");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3034");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3035");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3036");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3037");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int36 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3038");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3039");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3040");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3041");
        int[] intArray2 = new int[] { 1, (-1) };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3042");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3043");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3044");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3045");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3046");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3047");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3048");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3049");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3050");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3051");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3052");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3053");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3054");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3055");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3056");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3057");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3058");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3059");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3060");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3061");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3062");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3063");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3064");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3065");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3066");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3067");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3068");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3069");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3070");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3071");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3072");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3073");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3074");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3075");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3076");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3077");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3078");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3079");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3080");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3081");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3082");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3083");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3084");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3085");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3086");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3087");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3088");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3089");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3090");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3091");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3092");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3093");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3094");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3095");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3096");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3097");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3098");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3099");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3100");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3101");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3102");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3103");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3104");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3105");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3106");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3107");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3108");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3109");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3110");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3111");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3112");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3113");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3114");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3115");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3116");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3117");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3118");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3119");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3120");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3121");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3122");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3123");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3124");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3125");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3126");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3127");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3128");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3129");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3130");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3131");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3132");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3133");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3134");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3135");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3136");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3137");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3138");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3139");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int34 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3140");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3141");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3142");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3143");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3144");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3145");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3146");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3147");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3148");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3149");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3150");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3151");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3152");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3153");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3154");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3155");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3156");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3157");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3158");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3159");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3160");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3161");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3162");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) 'a');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3163");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3164");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3165");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3166");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3167");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3168");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3169");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (-1));
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3170");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3171");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) -1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3172");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3173");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3174");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3175");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 3);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) -1);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3176");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 1);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3177");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3178");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int23 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int25 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int27 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3179");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 2);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3180");
        int[] intArray1 = new int[] { (byte) -1 };
        int int3 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray1, 0);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3181");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3182");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3183");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) -1);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3184");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int32 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3185");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (-1));
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 1);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3186");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3187");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) '4');
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3188");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 3);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
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
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3189");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int30 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3190");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '#');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3191");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) ' ');
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3192");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3193");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3194");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 100);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 10);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3195");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 100);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 100);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int26 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int28 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3196");
        int[] intArray3 = new int[] { '4', 1, ' ' };
        int int5 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) ' ');
        int int7 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int9 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int11 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (short) 0);
        int int13 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 10);
        int int15 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 0);
        int int17 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 100);
        int int19 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, 2);
        int int21 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 1, 32]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3197");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) 'a');
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 2);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 3);
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 10);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3198");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '#');
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 1);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) '4');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 10);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (byte) 0);
        int int20 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, (int) (short) 1);
        int int22 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        int int24 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3199");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (-1));
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 0);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3200");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int8 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        int int10 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) '4');
        int int14 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) ' ');
        int int16 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray2, 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}


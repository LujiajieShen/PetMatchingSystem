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
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3002");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3003");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3004");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3005");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3006");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3007");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3008");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3009");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3010");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3011");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3012");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3013");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3014");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3015");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3016");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3017");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3018");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3019");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3020");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3021");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3022");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3023");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3024");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3025");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3026");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3027");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3028");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3029");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3030");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3031");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3032");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3033");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3034");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3035");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3036");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3037");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3038");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3039");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3040");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3041");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3042");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3043");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3044");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3045");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3046");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3047");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3048");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3049");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3050");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3051");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3052");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3053");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3054");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3055");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3056");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3057");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3058");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3059");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3060");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3061");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3062");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3063");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3064");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3065");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3066");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3067");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3068");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3069");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3070");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3071");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3072");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3073");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3074");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3075");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3076");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11 + "'", int36 == 11);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3077");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3078");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3079");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3080");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3081");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3082");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3083");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3084");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3085");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3086");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3087");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3088");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3089");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3090");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3091");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3092");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3093");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3094");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3095");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3096");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3097");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3098");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3099");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3100");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3101");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3102");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3103");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3104");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3105");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3106");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3107");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3108");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3109");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3110");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3111");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3112");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3113");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3114");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3115");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3116");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3117");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3118");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3119");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3120");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3121");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3122");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3123");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3124");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3125");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3126");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3127");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3128");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3129");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3130");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3131");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3132");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3133");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3134");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3135");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3136");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3137");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3138");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3139");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3140");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3141");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3142");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3143");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3144");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3145");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3146");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3147");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3148");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3149");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3150");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3151");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3152");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3153");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3154");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3155");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3156");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3157");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3158");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3159");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3160");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3161");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3162");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3163");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3164");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3165");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3166");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3167");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3168");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3169");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int32 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int34 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int36 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3170");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3171");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3172");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3173");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int28 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int30 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3174");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 11);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int26 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3175");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) -1);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        int int24 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3176");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 10);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 4);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3177");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3178");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 0);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) '4');
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        int int18 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 2);
        int int20 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        int int22 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3179");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) ' ');
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) -1);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 6);
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3180");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int4 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int6 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int8 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 0);
        int int10 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (-1));
        int int12 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (short) 100);
        int int14 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, 100);
        int int16 = correct_java_programs.POSSIBLE_CHANGE.possible_change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1001");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1009");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1010");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1011");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1012");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1013");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1014");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass19 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1015");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1016");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1017");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1018");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1019");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1020");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1021");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1022");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1023");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1024");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.lang.Class<?> wildcardClass13 = booleanList12.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1025");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList8);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList8);
        java.lang.Class<?> wildcardClass11 = booleanList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1026");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1027");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1028");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass14 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1029");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1030");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1031");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1032");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1033");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1034");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1035");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1036");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass12 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1037");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1038");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1039");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1040");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1041");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1042");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1043");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1044");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1045");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1046");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.lang.Class<?> wildcardClass26 = booleanList25.getClass();
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1047");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(10, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.all(booleanList25);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1048");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1049");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) ' ', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1050");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1051");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1052");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1053");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) 'a', intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1054");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1055");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1056");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass16 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1057");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1058");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1059");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1060");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1061");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1062");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1063");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1064");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1065");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1066");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1067");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1068");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1069");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1070");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1071");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1072");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1073");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1074");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1075");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1076");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1077");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1078");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList16);
        java.lang.Class<?> wildcardClass18 = booleanList16.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1079");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1080");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1081");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1082");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp(1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1083");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1084");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1085");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1086");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) ' ', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList13);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1087");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1088");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1089");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass9 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1090");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1091");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1092");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1093");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1094");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1095");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1096");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1097");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1098");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1099");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) ' ', intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1100");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1101");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1102");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1103");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1104");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1105");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1106");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1107");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass10 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1108");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1109");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1110");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1111");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1112");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1113");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1114");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1115");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1116");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1117");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1118");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1119");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1120");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1121");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1122");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1123");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1124");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1125");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1126");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1127");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1128");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1129");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1130");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1131");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1132");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1133");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1134");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1135");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1136");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1137");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1138");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1139");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass11 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1140");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1141");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1142");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1143");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1144");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1145");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1146");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1147");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1148");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1149");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1150");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1151");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1152");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1153");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1154");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass20 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1155");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1156");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1157");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass12 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1158");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1159");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1160");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1161");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1162");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass10 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1163");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1164");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1165");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1166");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1167");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1168");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1169");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1170");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1171");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1172");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1173");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1174");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1175");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList10);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList10);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1176");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1177");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1178");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1179");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1180");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1181");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1182");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1183");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1184");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1185");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1186");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1187");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1188");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1189");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1190");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1191");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1192");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.lang.Class<?> wildcardClass24 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1193");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1194");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1195");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1196");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1197");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1198");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1199");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1200");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1201");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1202");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1203");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1204");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass13 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1205");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1206");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1207");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1208");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1209");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1210");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1211");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1212");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1213");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1214");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1215");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1216");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1217");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1218");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1219");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1220");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1221");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1222");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1223");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(10, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1224");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1225");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1226");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1227");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1228");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1229");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1230");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1231");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1232");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass14 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1233");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1234");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1235");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1236");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1237");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1238");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1239");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1240");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList8);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList8);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList8);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1241");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1242");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1243");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1244");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass13 = booleanList12.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1245");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1246");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1247");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1248");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1249");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1250");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1251");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1252");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1253");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1254");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1255");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1256");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1257");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1258");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1259");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1260");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass11 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1261");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1262");
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList20);
        java.lang.Class<?> wildcardClass22 = booleanList20.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1263");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1264");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1265");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList12);
        java.lang.Class<?> wildcardClass24 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1266");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1267");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1268");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1269");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1270");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1271");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1272");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = correct_java_programs.SIEVE.list_comp((int) '#', intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1273");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1274");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1275");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1276");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1277");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1278");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1279");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1280");
        java.util.ArrayList<java.lang.Integer> intList12 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) '4', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        boolean boolean24 = correct_java_programs.SIEVE.all(booleanList23);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1281");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1282");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1283");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1284");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1285");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1286");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.lang.Class<?> wildcardClass17 = booleanList16.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1287");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1288");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1289");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList16);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList16);
        java.lang.Class<?> wildcardClass19 = booleanList16.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1290");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1291");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1292");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1293");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1294");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass20 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1295");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1296");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1297");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1298");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1299");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1300");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1301");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1302");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1303");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1304");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1305");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1306");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1307");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1308");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1309");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1310");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1311");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1312");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1313");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1314");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1315");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(10, intList8);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList12);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList12);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList12);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1316");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1317");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1318");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.all(booleanList17);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1319");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass9 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1320");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1321");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp(100, intList14);
        boolean boolean28 = correct_java_programs.SIEVE.all(booleanList27);
        boolean boolean29 = correct_java_programs.SIEVE.any(booleanList27);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1322");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1323");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1324");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1325");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1326");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList25);
        java.lang.Class<?> wildcardClass27 = booleanList25.getClass();
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1327");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1328");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1329");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1330");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1331");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1332");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1333");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1334");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) 'a', intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1335");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1336");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1337");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) '#', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1338");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList16);
        java.lang.Class<?> wildcardClass18 = booleanList16.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1339");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1340");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1341");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1342");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1343");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1344");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList14);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1345");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1346");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1347");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1348");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1349");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1350");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1351");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1352");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1353");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1354");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1355");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1356");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1357");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1358");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1359");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1360");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1361");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1362");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1363");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1364");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1365");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1366");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1367");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1368");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1369");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1370");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1371");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1372");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1373");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1374");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1375");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1376");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1377");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1378");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1379");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1380");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1381");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1382");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.lang.Class<?> wildcardClass13 = booleanList12.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1383");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1384");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1385");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1386");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1387");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1388");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1389");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1390");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1391");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1392");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList14);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList14);
        java.lang.Class<?> wildcardClass17 = booleanList14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1393");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1394");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1395");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1396");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1397");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1398");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1399");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1400");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.lang.Class<?> wildcardClass10 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1401");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1402");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1403");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp(0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1404");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1405");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1406");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1407");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1408");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1409");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1410");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList11);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1411");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1412");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1413");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1414");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1415");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1416");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1417");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1418");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1419");
        java.util.ArrayList<java.lang.Integer> intList14 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(0, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp((int) 'a', intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp(1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList26 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.util.ArrayList<java.lang.Boolean> booleanList27 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList14);
        java.lang.Class<?> wildcardClass28 = booleanList27.getClass();
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertNotNull(booleanList26);
        org.junit.Assert.assertNotNull(booleanList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1420");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1421");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1422");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1423");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1424");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1425");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1426");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1427");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1428");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.lang.Class<?> wildcardClass22 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1429");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass17 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1430");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1431");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1432");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1433");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(100, intList10);
        boolean boolean20 = correct_java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = correct_java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass22 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1434");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1435");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1436");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1437");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1438");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp(100, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.all(booleanList21);
        boolean boolean23 = correct_java_programs.SIEVE.any(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1439");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1440");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass16 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1441");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1442");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1443");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1444");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1445");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1446");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1447");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1448");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1449");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1450");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((-1), intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        java.lang.Class<?> wildcardClass19 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1451");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1452");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(1, intList8);
        boolean boolean16 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean17 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList15);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1453");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1454");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1455");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1456");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((-1), intList7);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1457");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList8);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1458");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1459");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList12);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList12);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1460");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = correct_java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1461");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1462");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) '#', intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1463");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp(1, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1464");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((-1), intList8);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList12);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList12);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1465");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1466");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1467");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1468");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1469");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) '4', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1470");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1471");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.all(booleanList14);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList14);
        java.lang.Class<?> wildcardClass17 = booleanList14.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1472");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(10, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1473");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList5);
        boolean boolean10 = correct_java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass11 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1474");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1475");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = correct_java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = correct_java_programs.SIEVE.all(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1476");
        java.util.ArrayList<java.lang.Integer> intList8 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1477");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1478");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList14);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList14);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1479");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1480");
        java.util.ArrayList<java.lang.Integer> intList13 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) 'a', intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = correct_java_programs.SIEVE.list_comp(1, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList24 = correct_java_programs.SIEVE.list_comp(10, intList13);
        java.util.ArrayList<java.lang.Boolean> booleanList25 = correct_java_programs.SIEVE.list_comp(0, intList13);
        boolean boolean26 = correct_java_programs.SIEVE.any(booleanList25);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(booleanList24);
        org.junit.Assert.assertNotNull(booleanList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1481");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1482");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1483");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1484");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((-1), intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1485");
        java.util.ArrayList<java.lang.Integer> intList10 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp(100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp(1, intList10);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1486");
        java.util.ArrayList<java.lang.Integer> intList11 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp(100, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) ' ', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = correct_java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList11);
        boolean boolean22 = correct_java_programs.SIEVE.any(booleanList21);
        java.lang.Class<?> wildcardClass23 = booleanList21.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1487");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = correct_java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = correct_java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = correct_java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1488");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(10, intList5);
        boolean boolean10 = correct_java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1489");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp(100, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1490");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1491");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = correct_java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = correct_java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = correct_java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1492");
        java.util.ArrayList<java.lang.Integer> intList2 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1493");
        java.util.ArrayList<java.lang.Integer> intList5 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1494");
        java.util.ArrayList<java.lang.Integer> intList3 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = correct_java_programs.SIEVE.any(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1495");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1496");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = correct_java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = correct_java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1497");
        java.util.ArrayList<java.lang.Integer> intList7 = correct_java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp(100, intList7);
        boolean boolean14 = correct_java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1498");
        java.util.ArrayList<java.lang.Integer> intList4 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = correct_java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1499");
        java.util.ArrayList<java.lang.Integer> intList6 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = correct_java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = correct_java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = correct_java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1500");
        java.util.ArrayList<java.lang.Integer> intList9 = correct_java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = correct_java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = correct_java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = correct_java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = correct_java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = correct_java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = correct_java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = correct_java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = correct_java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        boolean boolean18 = correct_java_programs.SIEVE.any(booleanList17);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }
}


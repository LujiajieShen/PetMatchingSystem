import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test1");
        java.util.ArrayList arrayList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.ArrayList> arrayListList1 = correct_java_programs.POWERSET.powerset(arrayList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test3");
        correct_java_programs.POWERSET pOWERSET0 = new correct_java_programs.POWERSET();
        java.lang.Class<?> wildcardClass1 = pOWERSET0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


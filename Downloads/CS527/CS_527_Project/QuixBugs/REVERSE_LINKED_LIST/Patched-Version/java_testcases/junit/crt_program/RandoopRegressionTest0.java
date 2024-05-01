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
        correct_java_programs.Node node0 = null;
        correct_java_programs.Node node1 = correct_java_programs.REVERSE_LINKED_LIST.reverse_linked_list(node0);
        org.junit.Assert.assertNull(node1);
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
        correct_java_programs.REVERSE_LINKED_LIST rEVERSE_LINKED_LIST0 = new correct_java_programs.REVERSE_LINKED_LIST();
        java.lang.Class<?> wildcardClass1 = rEVERSE_LINKED_LIST0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


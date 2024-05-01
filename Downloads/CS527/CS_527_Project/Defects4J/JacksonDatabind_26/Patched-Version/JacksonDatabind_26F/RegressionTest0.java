import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertTrue("'" + obj0 + "' != '" + com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY + "'", obj0.equals(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


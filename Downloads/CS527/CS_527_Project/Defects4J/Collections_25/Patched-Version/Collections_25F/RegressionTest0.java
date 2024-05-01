import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.collections4.OrderedIterator orderedIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR;
        org.junit.Assert.assertNotNull(orderedIterator0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (byte) 1, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor4);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray9 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray8;
        objItorArray9[0] = objItor0;
        objItorArray9[1] = objItor1;
        objItorArray9[2] = objItor2;
        objItorArray9[3] = objItor3;
        objItorArray9[4] = objItor4;
        objItorArray9[5] = objItor6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray9, 3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(objItorArray9);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.junit.Assert.assertNotNull(orderedMapIterator0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator1 = org.apache.commons.collections4.IteratorUtils.nodeListIterator(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Node must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.collections4.MapIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[], org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.w3c.dom.NodeList nodeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator1 = org.apache.commons.collections4.IteratorUtils.nodeListIterator(nodeList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: NodeList must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.Iterator<?>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardItorArray0, (int) (byte) -1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "hi!", (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 10, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d, (byte) -1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objArray3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0, -1, 0]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator[], java.lang.reflect.GenericDeclaration> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIterator0, 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIterator0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorItor0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strItor0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationItor12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) true, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        java.util.ListIterator[] listIteratorArray1 = new java.util.ListIterator[] { resettableListIterator0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(listIteratorArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(listIteratorArray1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.collections4.OrderedIterator<java.lang.Class<?>> wildcardClassItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.Class[] classArray5 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass1;
        wildcardClassArray6[1] = wildcardClass3;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray6, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray1, 5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.Iterator<? extends java.lang.Object[]>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.Object[]> objArrayItor1 = org.apache.commons.collections4.IteratorUtils.chainedIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 0L, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.collections4.MapIterator mapIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) mapIterator0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIterator0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 100.0f, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray3, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass2 = objItor1.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass4 = objItor3.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass6 = objItor5.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass8 = objItor7.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass10 = objItor9.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray11 = new java.lang.reflect.GenericDeclaration[] { wildcardClass2, wildcardClass4, wildcardClass6, wildcardClass8, wildcardClass10 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray11, 0);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray14 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorArray14);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor17 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass18 = objItor17.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor19 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass20 = objItor19.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor21 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass22 = objItor21.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor23 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass24 = objItor23.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor25 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18, wildcardClass20, wildcardClass22, wildcardClass24, wildcardClass26 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor29 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor30 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableListIterator) genericDeclarationItor29);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor31 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray32 = new org.apache.commons.collections4.ResettableListIterator[] { genericDeclarationItor0, genericDeclarationItor13, strComparableItor16, genericDeclarationItor29, strItor31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray32, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(genericDeclarationArray11);
        org.junit.Assert.assertNotNull(genericDeclarationItor13);
        org.junit.Assert.assertNotNull(resettableIteratorArray14);
        org.junit.Assert.assertNotNull(resettableIteratorItor15);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objItor21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor29);
        org.junit.Assert.assertNotNull(resettableListIteratorItor30);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertNotNull(resettableListIteratorArray32);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18, 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.io.Serializable> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.collections4.MapIterator<java.lang.Comparable<java.lang.String>, org.apache.commons.collections4.ResettableIterator> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorItor1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray10, 6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>[], java.lang.reflect.Type> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.util.ListIterator[][] listIteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationItor0, (int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 1, 5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor19);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor35 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][]) genericDeclarationArray5, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator, java.io.Serializable> listIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(listIteratorItor0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor0, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(objArrayItor0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) annotatedElementItor0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(resettableListIteratorItor0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClass3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(annotatedElementItor4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) wildcardClassArray18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(objItor33);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (byte) -1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.GenericDeclaration, org.apache.commons.collections4.ResettableIterator> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1L, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator> listIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (short) 0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator("");
        java.lang.Class<?> wildcardClass2 = strItor1.getClass();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = null;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIterator0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIterator0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.GenericDeclaration, java.util.ListIterator> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.chainedIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(resettableListIteratorItor0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, org.apache.commons.collections4.ResettableIterator[]> resettableIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorItor0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorItor2, 3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItorItor2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) genericDeclarationArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorItor1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableItor3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        java.util.Iterator<?> wildcardItor34 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) typeItor33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) typeItor33, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
        org.junit.Assert.assertNotNull(wildcardItor34);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor0);
        java.util.ListIterator[] listIteratorArray2 = new java.util.ListIterator[] { genericDeclarationArrayItor0 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor3);
        java.util.ListIterator[] listIteratorArray5 = new java.util.ListIterator[] { genericDeclarationArrayItor3 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor6);
        java.util.ListIterator[] listIteratorArray8 = new java.util.ListIterator[] { genericDeclarationArrayItor6 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor9);
        java.util.ListIterator[] listIteratorArray11 = new java.util.ListIterator[] { genericDeclarationArrayItor9 };
        java.util.ListIterator[][] listIteratorArray12 = new java.util.ListIterator[][] { listIteratorArray2, listIteratorArray5, listIteratorArray8, listIteratorArray11 };
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
        org.junit.Assert.assertNotNull(listIteratorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(listIteratorArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertNotNull(listIteratorArray8);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertNotNull(listIteratorArray11);
        org.junit.Assert.assertNotNull(listIteratorArray12);
        org.junit.Assert.assertNotNull(listIteratorArrayItor13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.collections4.OrderedIterator<java.io.Serializable> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.collections4.OrderedIterator<java.util.ListIterator[]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][]) genericDeclarationArray5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) wildcardClassArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(annotatedElementItor31);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (short) 0);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardItor1);
        org.junit.Assert.assertNotNull(wildcardItor1);
        org.junit.Assert.assertNotNull(wildcardItorItor2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration[]> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorItor0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration[][]> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>> objItorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(objItorItorItor0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[][] strArray42 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34, strArray41 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor45 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray42, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) wildcardClassArray18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.collections4.OrderedIterator<java.lang.Object> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor3, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.collections4.MapIterator<java.util.ListIterator, org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> listIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(listIteratorItor0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>[], org.apache.commons.collections4.OrderedIterator<java.lang.Object>> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArrayItor0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>, java.lang.reflect.GenericDeclaration[]> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator> listIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorItor0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) annotatedElementItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(annotatedElementItor4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(objItor33);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor0);
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardItor1);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItorItor5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItor6, 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String, org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(strItor0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray2);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) strArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray2, 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray11, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor19);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray3 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][]> typeArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor0);
        java.util.ListIterator[] listIteratorArray2 = new java.util.ListIterator[] { genericDeclarationArrayItor0 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor3);
        java.util.ListIterator[] listIteratorArray5 = new java.util.ListIterator[] { genericDeclarationArrayItor3 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor6);
        java.util.ListIterator[] listIteratorArray8 = new java.util.ListIterator[] { genericDeclarationArrayItor6 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor9);
        java.util.ListIterator[] listIteratorArray11 = new java.util.ListIterator[] { genericDeclarationArrayItor9 };
        java.util.ListIterator[][] listIteratorArray12 = new java.util.ListIterator[][] { listIteratorArray2, listIteratorArray5, listIteratorArray8, listIteratorArray11 };
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray12, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
        org.junit.Assert.assertNotNull(listIteratorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(listIteratorArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertNotNull(listIteratorArray8);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertNotNull(listIteratorArray11);
        org.junit.Assert.assertNotNull(listIteratorArray12);
        org.junit.Assert.assertNotNull(listIteratorArrayItor13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) genericDeclarationArrayItor0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableItor1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableItor1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[][]> listIteratorArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) typeItor31, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type[][], java.lang.Class<?>[][]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator<?>, org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> wildcardItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItorItor0, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorItor0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator<?>, java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, org.apache.commons.collections4.ResettableListIterator[]> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItorItor5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorItor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        java.util.ListIterator<java.lang.reflect.Type[]> typeArrayItor31 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) wildcardClassArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeArrayItor31);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.zippingIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItor6, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator, java.lang.reflect.Type> listIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) listIteratorItor0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIteratorItor0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorItor1, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.ListIterator[][][] listIteratorArray0 = new java.util.ListIterator[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(listIteratorArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIteratorArray0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.zippingIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceItor6, (-1), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>> objItorItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableListIterator0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIterator0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object[]) iteratorArray1);
        java.lang.Class<?> wildcardClass5 = objArrayItor4.getClass();
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objArrayItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray18, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray6 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray6);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) typeArrayItor8, 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArrayItor7);
        org.junit.Assert.assertNotNull(typeArrayItor8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 6, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray0, 2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableItor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableItor7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray6 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray6);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) typeArrayItor8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArrayItor7);
        org.junit.Assert.assertNotNull(typeArrayItor8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray6 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray12 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray13 = new java.lang.reflect.Type[][] { typeArray7, typeArray8, typeArray9, typeArray10, typeArray11, typeArray12 };
        java.lang.reflect.Type[] typeArray14 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray15 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray16 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray17 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray18 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray19 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray20 = new java.lang.reflect.Type[][] { typeArray14, typeArray15, typeArray16, typeArray17, typeArray18, typeArray19 };
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray22 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray23 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray25 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray26 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray27 = new java.lang.reflect.Type[][] { typeArray21, typeArray22, typeArray23, typeArray24, typeArray25, typeArray26 };
        java.lang.reflect.Type[][][] typeArray28 = new java.lang.reflect.Type[][][] { typeArray6, typeArray13, typeArray20, typeArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray28, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorArrayItor4, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItor1, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][]> typeArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator<?>[]) iteratorArray1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.collections4.OrderedIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(annotatedElementItor31);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(annotatedElementItor31);
        org.junit.Assert.assertNotNull(genericDeclarationItor32);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor35 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(annotatedElementItor31);
        org.junit.Assert.assertNotNull(genericDeclarationItor32);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.io.Serializable serializable0 = null;
        java.util.ListIterator<java.io.Serializable> serializableItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializable0);
        org.junit.Assert.assertNotNull(serializableItor1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) genericDeclarationArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationArrayItor0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationItor0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonIterator(genericDeclarationArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][]) genericDeclarationArray5, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MapIterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[]> listIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray18, 0, (int) (short) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) typeItor34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(objItor33);
        org.junit.Assert.assertNotNull(typeItor34);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.collections4.MapIterator<java.lang.CharSequence, java.lang.String[]> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[], java.util.ListIterator> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>> objItorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(objItorItorItor0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 10, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor9);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) genericDeclarationArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorItor1, (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorArrayItor5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorArrayItor4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItor1, (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableListIteratorArray7, 5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray2);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) strArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>> objItorItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Class<?>[][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray0, 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableListIterator) genericDeclarationItor12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIteratorItor13, (int) (byte) -1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
        org.junit.Assert.assertNotNull(resettableListIteratorItor13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass4 = genericDeclarationArrayItor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClass4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray3, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.Type[], java.lang.Object[]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>> objItorItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) typeArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) listIteratorArrayItor0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>[][], java.lang.reflect.GenericDeclaration[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.Iterator<?> wildcardItor5 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) annotatedElementItor4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[][]> listIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItor5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(annotatedElementItor4);
        org.junit.Assert.assertNotNull(wildcardItor5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonIterator(genericDeclarationArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationArrayItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceItor0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorItor3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) listIteratorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorArrayItor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray18, 0, (int) (short) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(objItor33);
        org.junit.Assert.assertNotNull(typeItor34);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor6);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorArrayItor5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) genericDeclarationArrayItor6, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorArrayItor5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.collections4.MapIterator<java.util.ListIterator[], java.lang.reflect.GenericDeclaration[][]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) listIteratorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorItor1, 5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator, org.apache.commons.collections4.ResettableIterator[]> resettableListIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableListIteratorItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorItor0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray0, strArray1 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (byte) 0, 1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>, org.apache.commons.collections4.ResettableIterator> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) objItorArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(objItorArrayItor3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(resettableIteratorItor0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[][]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorArrayItor9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.collections4.MapIterator<java.lang.String, org.apache.commons.collections4.ResettableIterator[]> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strItor0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String[][][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) typeArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.collections4.OrderedIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItor1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(charSequenceItor4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray0, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.collections4.OrderedIterator<java.lang.Class<?>[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArrayItor0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArrayItor0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.util.ListIterator[]> listIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) listIteratorArrayItor6, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(listIteratorArrayItor6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray6, strArray13 };
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray29 = new java.lang.String[][] { strArray21, strArray28 };
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray43 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray44 = new java.lang.String[][] { strArray36, strArray43 };
        java.lang.String[] strArray51 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray58 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray59 = new java.lang.String[][] { strArray51, strArray58 };
        java.lang.String[] strArray66 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray74 = new java.lang.String[][] { strArray66, strArray73 };
        java.lang.String[][][] strArray75 = new java.lang.String[][][] { strArray14, strArray29, strArray44, strArray59, strArray74 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor77 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray75, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type[], java.lang.reflect.Type[][]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<?>[] wildcardItorArray2 = (java.util.Iterator<?>[]) iteratorArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator<?>[]) iteratorArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.collections4.MapIterator mapIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[]> listIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) mapIterator0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIterator0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray1 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray2 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray3 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator[][] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[][] { resettableIteratorArray0, resettableIteratorArray1, resettableIteratorArray2, resettableIteratorArray3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorArray1);
        org.junit.Assert.assertNotNull(resettableIteratorArray2);
        org.junit.Assert.assertNotNull(resettableIteratorArray3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator[], java.lang.CharSequence> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = genericDeclarationArrayItor0.getClass();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor19);
        org.junit.Assert.assertNotNull(objItor20);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray11, (int) (byte) 10, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.Type[]> typeArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.Type[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(typeArrayItor6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type[][], org.apache.commons.collections4.ResettableListIterator> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = objItorItor0.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass1);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray3 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray3);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray3);
        java.lang.Class<?> wildcardClass6 = resettableIteratorItor5.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass6, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor11 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass12 = objItorItor11.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass12);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray14 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        java.lang.Class<?> wildcardClass17 = resettableIteratorItor16.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor18 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass17);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor19 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass20 = objItor19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass12, wildcardClass17, wildcardClass20 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass23 = objItorItor22.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor24 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass23);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray25 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray25);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray25);
        java.lang.Class<?> wildcardClass28 = resettableIteratorItor27.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor29 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass28);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass31 = objItor30.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass23, wildcardClass28, wildcardClass31 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor33 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass34 = objItorItor33.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor35 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass34);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray36 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray36);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray36);
        java.lang.Class<?> wildcardClass39 = resettableIteratorItor38.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor40 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass39);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor41 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass42 = objItor41.getClass();
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] { wildcardClass34, wildcardClass39, wildcardClass42 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass45 = objItorItor44.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass45);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray47 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor48 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray47);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray47);
        java.lang.Class<?> wildcardClass50 = resettableIteratorItor49.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor51 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass50);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor52 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass53 = objItor52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass45, wildcardClass50, wildcardClass53 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor55 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass56 = objItorItor55.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor57 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass56);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray58 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor59 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor60 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray58);
        java.lang.Class<?> wildcardClass61 = resettableIteratorItor60.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor62 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass61);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor63 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass64 = objItor63.getClass();
        java.lang.reflect.Type[] typeArray65 = new java.lang.reflect.Type[] { wildcardClass56, wildcardClass61, wildcardClass64 };
        java.lang.reflect.Type[][] typeArray66 = new java.lang.reflect.Type[][] { typeArray10, typeArray21, typeArray32, typeArray43, typeArray54, typeArray65 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor68 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray66, 4);
        java.util.ListIterator<java.lang.reflect.Type[][]> typeArrayItor69 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeArray66);
        org.junit.Assert.assertNotNull(objItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(annotatedElementItor2);
        org.junit.Assert.assertNotNull(resettableIteratorArray3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(objItorItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(annotatedElementItor13);
        org.junit.Assert.assertNotNull(resettableIteratorArray14);
        org.junit.Assert.assertNotNull(resettableIteratorItor15);
        org.junit.Assert.assertNotNull(resettableIteratorItor16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(annotatedElementItor18);
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(objItorItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(annotatedElementItor24);
        org.junit.Assert.assertNotNull(resettableIteratorArray25);
        org.junit.Assert.assertNotNull(resettableIteratorItor26);
        org.junit.Assert.assertNotNull(resettableIteratorItor27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(annotatedElementItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(objItorItor33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(annotatedElementItor35);
        org.junit.Assert.assertNotNull(resettableIteratorArray36);
        org.junit.Assert.assertNotNull(resettableIteratorItor37);
        org.junit.Assert.assertNotNull(resettableIteratorItor38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(annotatedElementItor40);
        org.junit.Assert.assertNotNull(objItor41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(objItorItor44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(annotatedElementItor46);
        org.junit.Assert.assertNotNull(resettableIteratorArray47);
        org.junit.Assert.assertNotNull(resettableIteratorItor48);
        org.junit.Assert.assertNotNull(resettableIteratorItor49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(annotatedElementItor51);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(objItorItor55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(annotatedElementItor57);
        org.junit.Assert.assertNotNull(resettableIteratorArray58);
        org.junit.Assert.assertNotNull(resettableIteratorItor59);
        org.junit.Assert.assertNotNull(resettableIteratorItor60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(annotatedElementItor62);
        org.junit.Assert.assertNotNull(objItor63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArrayItor68);
        org.junit.Assert.assertNotNull(typeArrayItor69);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>, org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItorItorItor0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = null;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[][]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.util.ListIterator[]> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (-1.0d), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray0 = new org.apache.commons.collections4.ResettableListIterator[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray0, 16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = objItorItor0.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass1);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray3 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray3);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray3);
        java.lang.Class<?> wildcardClass6 = resettableIteratorItor5.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass6, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor11 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass12 = objItorItor11.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass12);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray14 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        java.lang.Class<?> wildcardClass17 = resettableIteratorItor16.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor18 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass17);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor19 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass20 = objItor19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass12, wildcardClass17, wildcardClass20 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass23 = objItorItor22.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor24 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass23);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray25 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray25);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray25);
        java.lang.Class<?> wildcardClass28 = resettableIteratorItor27.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor29 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass28);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass31 = objItor30.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass23, wildcardClass28, wildcardClass31 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor33 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass34 = objItorItor33.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor35 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass34);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray36 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray36);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray36);
        java.lang.Class<?> wildcardClass39 = resettableIteratorItor38.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor40 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass39);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor41 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass42 = objItor41.getClass();
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] { wildcardClass34, wildcardClass39, wildcardClass42 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass45 = objItorItor44.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass45);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray47 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor48 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray47);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray47);
        java.lang.Class<?> wildcardClass50 = resettableIteratorItor49.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor51 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass50);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor52 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass53 = objItor52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass45, wildcardClass50, wildcardClass53 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor55 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass56 = objItorItor55.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor57 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass56);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray58 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor59 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor60 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray58);
        java.lang.Class<?> wildcardClass61 = resettableIteratorItor60.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor62 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass61);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor63 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass64 = objItor63.getClass();
        java.lang.reflect.Type[] typeArray65 = new java.lang.reflect.Type[] { wildcardClass56, wildcardClass61, wildcardClass64 };
        java.lang.reflect.Type[][] typeArray66 = new java.lang.reflect.Type[][] { typeArray10, typeArray21, typeArray32, typeArray43, typeArray54, typeArray65 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor68 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray66, 4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray66);
        java.util.Iterator<?> wildcardItor70 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) typeArrayItor69);
        org.junit.Assert.assertNotNull(objItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(annotatedElementItor2);
        org.junit.Assert.assertNotNull(resettableIteratorArray3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(objItorItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(annotatedElementItor13);
        org.junit.Assert.assertNotNull(resettableIteratorArray14);
        org.junit.Assert.assertNotNull(resettableIteratorItor15);
        org.junit.Assert.assertNotNull(resettableIteratorItor16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(annotatedElementItor18);
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(objItorItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(annotatedElementItor24);
        org.junit.Assert.assertNotNull(resettableIteratorArray25);
        org.junit.Assert.assertNotNull(resettableIteratorItor26);
        org.junit.Assert.assertNotNull(resettableIteratorItor27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(annotatedElementItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(objItorItor33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(annotatedElementItor35);
        org.junit.Assert.assertNotNull(resettableIteratorArray36);
        org.junit.Assert.assertNotNull(resettableIteratorItor37);
        org.junit.Assert.assertNotNull(resettableIteratorItor38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(annotatedElementItor40);
        org.junit.Assert.assertNotNull(objItor41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(objItorItor44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(annotatedElementItor46);
        org.junit.Assert.assertNotNull(resettableIteratorArray47);
        org.junit.Assert.assertNotNull(resettableIteratorItor48);
        org.junit.Assert.assertNotNull(resettableIteratorItor49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(annotatedElementItor51);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(objItorItor55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(annotatedElementItor57);
        org.junit.Assert.assertNotNull(resettableIteratorArray58);
        org.junit.Assert.assertNotNull(resettableIteratorItor59);
        org.junit.Assert.assertNotNull(resettableIteratorItor60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(annotatedElementItor62);
        org.junit.Assert.assertNotNull(objItor63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArrayItor68);
        org.junit.Assert.assertNotNull(typeArrayItor69);
        org.junit.Assert.assertNotNull(wildcardItor70);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray11);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray11, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor19);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor21);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] { strArray0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.collections4.OrderedIterator<java.lang.Class<?>[]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.collections4.MapIterator<java.util.Iterator<?>, java.lang.reflect.Type[]> wildcardItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorItor0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator[][]> listIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) listIteratorArrayItor9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor7);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorArrayItor9);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.reflect.Type[] typeArray0 = null;
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeArray0);
        org.junit.Assert.assertNotNull(typeArrayItor1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) annotatedElementItor31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(annotatedElementItor31);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray2, strArray5, strArray8 };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray12, strArray15, strArray18 };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[][] strArray29 = new java.lang.String[][] { strArray22, strArray25, strArray28 };
        java.lang.String[][][] strArray30 = new java.lang.String[][][] { strArray9, strArray19, strArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray30, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableListIterator[], org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> resettableListIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) annotatedElementItor7, (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor4, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.util.Iterator<?> wildcardItor5 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) annotatedElementItor4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][]> listIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) annotatedElementItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(annotatedElementItor4);
        org.junit.Assert.assertNotNull(wildcardItor5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.Iterator<?> wildcardItor0 = null;
        java.util.ListIterator<java.util.Iterator<?>> wildcardItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardItor0);
        org.junit.Assert.assertNotNull(wildcardItorItor1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(objItor33);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.util.ListIterator[]> listIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) listIteratorArrayItor6, 16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(listIteratorArrayItor6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray6);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray7, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(resettableListIteratorItor10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationItor12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor11);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArray18, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.GenericDeclaration[], org.apache.commons.collections4.ResettableIterator> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>[]> wildcardClassArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArrayItor6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.GenericDeclaration[], java.lang.String[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        java.util.ListIterator<java.lang.reflect.Type[]> typeArrayItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) wildcardClassArray18, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
        org.junit.Assert.assertNotNull(typeArrayItor34);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[], java.lang.reflect.GenericDeclaration[][]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        java.lang.Class<?> wildcardClass33 = genericDeclarationArrayItor32.getClass();
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor0);
        java.util.ListIterator[] listIteratorArray2 = new java.util.ListIterator[] { genericDeclarationArrayItor0 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor3);
        java.util.ListIterator[] listIteratorArray5 = new java.util.ListIterator[] { genericDeclarationArrayItor3 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor6);
        java.util.ListIterator[] listIteratorArray8 = new java.util.ListIterator[] { genericDeclarationArrayItor6 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor9);
        java.util.ListIterator[] listIteratorArray11 = new java.util.ListIterator[] { genericDeclarationArrayItor9 };
        java.util.ListIterator[][] listIteratorArray12 = new java.util.ListIterator[][] { listIteratorArray2, listIteratorArray5, listIteratorArray8, listIteratorArray11 };
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[]> listIteratorArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(listIteratorArray12, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
        org.junit.Assert.assertNotNull(listIteratorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(listIteratorArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertNotNull(listIteratorArray8);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertNotNull(listIteratorArray11);
        org.junit.Assert.assertNotNull(listIteratorArray12);
        org.junit.Assert.assertNotNull(listIteratorArrayItor13);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.ListIterator>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) listIteratorItor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassItor32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(wildcardClassItor32);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorArrayItor5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = objItorItor0.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass1, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(annotatedElementItor2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.collections4.ResettableIterator[][][] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[][]> resettableIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        java.util.ListIterator<java.util.ListIterator[]> listIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) listIteratorArrayItor10, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(listIteratorArrayItor10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = null;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIterator0);
        java.util.ListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Object) resettableIterator0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIterator0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(objItor2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArrayItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray2);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray2, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray18);
        java.util.ListIterator<java.util.ListIterator> listIteratorItor33 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.ListIterator) wildcardClassItor32);
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(wildcardClassItor32);
        org.junit.Assert.assertNotNull(listIteratorItor33);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objArrayItor33, 6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.collections4.MapIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[], java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray7, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) (short) 0, (int) (short) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray18);
        java.util.Iterator<?> wildcardItor35 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardClassItor34);
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor33);
        org.junit.Assert.assertNotNull(wildcardClassItor34);
        org.junit.Assert.assertNotNull(wildcardItor35);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>> objItorItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (byte) 10, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray6);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray6, 2);
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.CharSequence[]) strArray6, 2);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(charSequenceItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.Type, java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator, java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]> listIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(listIteratorItor0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor7);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor8);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIteratorItor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(resettableListIteratorItor10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.Iterator[][] iteratorArray1 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray1;
        java.util.Iterator[][] iteratorArray4 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray5 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray4;
        java.util.Iterator[][] iteratorArray7 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray8 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray7;
        java.util.Iterator[][] iteratorArray10 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray11 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray10;
        java.util.Iterator[][] iteratorArray13 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray14 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray13;
        java.util.Iterator[][][] iteratorArray16 = new java.util.Iterator[5][][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][] wildcardItorArray17 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]) iteratorArray16;
        wildcardItorArray17[0] = wildcardItorArray2;
        wildcardItorArray17[1] = wildcardItorArray5;
        wildcardItorArray17[2] = wildcardItorArray8;
        wildcardItorArray17[3] = wildcardItorArray11;
        wildcardItorArray17[4] = wildcardItorArray14;
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItorArray17, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that ends beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(iteratorArray4);
        org.junit.Assert.assertNotNull(wildcardItorArray5);
        org.junit.Assert.assertNotNull(iteratorArray7);
        org.junit.Assert.assertNotNull(wildcardItorArray8);
        org.junit.Assert.assertNotNull(iteratorArray10);
        org.junit.Assert.assertNotNull(wildcardItorArray11);
        org.junit.Assert.assertNotNull(iteratorArray13);
        org.junit.Assert.assertNotNull(wildcardItorArray14);
        org.junit.Assert.assertNotNull(iteratorArray16);
        org.junit.Assert.assertNotNull(wildcardItorArray17);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor28);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.reflect.Type[][][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][]> typeArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray18, 0, (int) (short) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        java.util.ListIterator<java.lang.Class<?>[]> wildcardClassArrayItor35 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray18);
        java.util.Iterator<?> wildcardItor36 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItor36, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(objItor33);
        org.junit.Assert.assertNotNull(typeItor34);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor35);
        org.junit.Assert.assertNotNull(wildcardItor36);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor0);
        java.util.ListIterator[] listIteratorArray2 = new java.util.ListIterator[] { genericDeclarationArrayItor0 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor3);
        java.util.ListIterator[] listIteratorArray5 = new java.util.ListIterator[] { genericDeclarationArrayItor3 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor6);
        java.util.ListIterator[] listIteratorArray8 = new java.util.ListIterator[] { genericDeclarationArrayItor6 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor9);
        java.util.ListIterator[] listIteratorArray11 = new java.util.ListIterator[] { genericDeclarationArrayItor9 };
        java.util.ListIterator[][] listIteratorArray12 = new java.util.ListIterator[][] { listIteratorArray2, listIteratorArray5, listIteratorArray8, listIteratorArray11 };
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) listIteratorArray12, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
        org.junit.Assert.assertNotNull(listIteratorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(listIteratorArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertNotNull(listIteratorArray8);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertNotNull(listIteratorArray11);
        org.junit.Assert.assertNotNull(listIteratorArray12);
        org.junit.Assert.assertNotNull(listIteratorArrayItor13);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableListIterator) genericDeclarationArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationArrayItor0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(resettableListIteratorItor1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.io.Serializable> serializableItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.ResettableIterator[]) resettableListIteratorArray7);
        java.util.ListIterator<java.util.ListIterator[]> listIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(listIteratorArrayItor10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.Type[][]> typeArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.Type[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorItor9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
        org.junit.Assert.assertNotNull(typeArrayItor8);
        org.junit.Assert.assertNotNull(objItorItor9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIteratorItor10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(resettableListIteratorItor10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 0.0d, 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray4, strArray9, strArray14 };
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[][] strArray31 = new java.lang.String[][] { strArray20, strArray25, strArray30 };
        java.lang.String[] strArray36 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[][] strArray47 = new java.lang.String[][] { strArray36, strArray41, strArray46 };
        java.lang.String[] strArray52 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray57 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray62 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[][] strArray63 = new java.lang.String[][] { strArray52, strArray57, strArray62 };
        java.lang.String[] strArray68 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray73 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[] strArray78 = new java.lang.String[] { "", "", "", "" };
        java.lang.String[][] strArray79 = new java.lang.String[][] { strArray68, strArray73, strArray78 };
        java.lang.String[][][] strArray80 = new java.lang.String[][][] { strArray15, strArray31, strArray47, strArray63, strArray79 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor82 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray80, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.GenericDeclaration[], java.io.Serializable> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] { wildcardClass3 };
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray6 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray6);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray6);
        java.lang.Class<?> wildcardClass9 = resettableIteratorItor8.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass9);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray11 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9 };
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray12 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray12);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray12);
        java.lang.Class<?> wildcardClass15 = resettableIteratorItor14.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor16 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass15);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray17 = new java.lang.reflect.GenericDeclaration[] { wildcardClass15 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray18 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray5, genericDeclarationArray11, genericDeclarationArray17 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray18 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray19, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(annotatedElementItor4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(resettableIteratorArray6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(resettableIteratorItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(annotatedElementItor10);
        org.junit.Assert.assertNotNull(genericDeclarationArray11);
        org.junit.Assert.assertNotNull(resettableIteratorArray12);
        org.junit.Assert.assertNotNull(resettableIteratorItor13);
        org.junit.Assert.assertNotNull(resettableIteratorItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(annotatedElementItor16);
        org.junit.Assert.assertNotNull(genericDeclarationArray17);
        org.junit.Assert.assertNotNull(genericDeclarationArray18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>[], org.apache.commons.collections4.ResettableListIterator[]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, org.apache.commons.collections4.ResettableListIterator[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (short) 0, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.collections4.MapIterator[] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) mapIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray0, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>, java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]> objItorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorItorItor0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableItor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArrayItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.lang.Class<?> wildcardClass3 = objItor0.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor7, (int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type[][], org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Iterator[][] iteratorArray1 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray1;
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorArrayItor3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor3);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor6);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor7);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2, genericDeclarationArray3 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray7 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray5, genericDeclarationArray6, genericDeclarationArray7, genericDeclarationArray8 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray11 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray12 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray14 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray10, genericDeclarationArray11, genericDeclarationArray12, genericDeclarationArray13 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray15 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray16 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray17 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray18 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray15, genericDeclarationArray16, genericDeclarationArray17, genericDeclarationArray18 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray21 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray23 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray24 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray20, genericDeclarationArray21, genericDeclarationArray22, genericDeclarationArray23 };
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray25 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray4, genericDeclarationArray9, genericDeclarationArray14, genericDeclarationArray19, genericDeclarationArray24 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray25, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
        org.junit.Assert.assertNotNull(genericDeclarationArray7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationArray11);
        org.junit.Assert.assertNotNull(genericDeclarationArray12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(genericDeclarationArray14);
        org.junit.Assert.assertNotNull(genericDeclarationArray15);
        org.junit.Assert.assertNotNull(genericDeclarationArray16);
        org.junit.Assert.assertNotNull(genericDeclarationArray17);
        org.junit.Assert.assertNotNull(genericDeclarationArray18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(genericDeclarationArray21);
        org.junit.Assert.assertNotNull(genericDeclarationArray22);
        org.junit.Assert.assertNotNull(genericDeclarationArray23);
        org.junit.Assert.assertNotNull(genericDeclarationArray24);
        org.junit.Assert.assertNotNull(genericDeclarationArray25);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], java.lang.String> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.ResettableIterator[]) resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorItor9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray5 = new org.apache.commons.collections4.ResettableIterator[] { objArrayItor4 };
        org.apache.commons.collections4.ResettableIterator[][] resettableIteratorArray6 = new org.apache.commons.collections4.ResettableIterator[][] { resettableIteratorArray5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray6, (int) (byte) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorArray5);
        org.junit.Assert.assertNotNull(resettableIteratorArray6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        java.util.ListIterator<java.util.ListIterator[]> listIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator[]) resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(listIteratorArrayItor10);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor11);
        org.junit.Assert.assertNotNull(annotatedElementItor12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.reflect.Type[][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArray18, 6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = objItorItor0.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass1);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray3 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray3);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray3);
        java.lang.Class<?> wildcardClass6 = resettableIteratorItor5.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass6, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor11 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass12 = objItorItor11.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass12);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray14 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray14);
        java.lang.Class<?> wildcardClass17 = resettableIteratorItor16.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor18 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass17);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor19 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass20 = objItor19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass12, wildcardClass17, wildcardClass20 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass23 = objItorItor22.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor24 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass23);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray25 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray25);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray25);
        java.lang.Class<?> wildcardClass28 = resettableIteratorItor27.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor29 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass28);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass31 = objItor30.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass23, wildcardClass28, wildcardClass31 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor33 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass34 = objItorItor33.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor35 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass34);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray36 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray36);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray36);
        java.lang.Class<?> wildcardClass39 = resettableIteratorItor38.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor40 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass39);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor41 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass42 = objItor41.getClass();
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] { wildcardClass34, wildcardClass39, wildcardClass42 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass45 = objItorItor44.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass45);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray47 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor48 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray47);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray47);
        java.lang.Class<?> wildcardClass50 = resettableIteratorItor49.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor51 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass50);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor52 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass53 = objItor52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass45, wildcardClass50, wildcardClass53 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor55 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass56 = objItorItor55.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor57 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass56);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray58 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor59 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor60 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray58);
        java.lang.Class<?> wildcardClass61 = resettableIteratorItor60.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor62 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement) wildcardClass61);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor63 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass64 = objItor63.getClass();
        java.lang.reflect.Type[] typeArray65 = new java.lang.reflect.Type[] { wildcardClass56, wildcardClass61, wildcardClass64 };
        java.lang.reflect.Type[][] typeArray66 = new java.lang.reflect.Type[][] { typeArray10, typeArray21, typeArray32, typeArray43, typeArray54, typeArray65 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor68 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray66, 4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray66);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor70 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableIterator) typeArrayItor69);
        org.junit.Assert.assertNotNull(objItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(annotatedElementItor2);
        org.junit.Assert.assertNotNull(resettableIteratorArray3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(objItorItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(annotatedElementItor13);
        org.junit.Assert.assertNotNull(resettableIteratorArray14);
        org.junit.Assert.assertNotNull(resettableIteratorItor15);
        org.junit.Assert.assertNotNull(resettableIteratorItor16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(annotatedElementItor18);
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(objItorItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(annotatedElementItor24);
        org.junit.Assert.assertNotNull(resettableIteratorArray25);
        org.junit.Assert.assertNotNull(resettableIteratorItor26);
        org.junit.Assert.assertNotNull(resettableIteratorItor27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(annotatedElementItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(objItorItor33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(annotatedElementItor35);
        org.junit.Assert.assertNotNull(resettableIteratorArray36);
        org.junit.Assert.assertNotNull(resettableIteratorItor37);
        org.junit.Assert.assertNotNull(resettableIteratorItor38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(annotatedElementItor40);
        org.junit.Assert.assertNotNull(objItor41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(objItorItor44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(annotatedElementItor46);
        org.junit.Assert.assertNotNull(resettableIteratorArray47);
        org.junit.Assert.assertNotNull(resettableIteratorItor48);
        org.junit.Assert.assertNotNull(resettableIteratorItor49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(annotatedElementItor51);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(objItorItor55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(annotatedElementItor57);
        org.junit.Assert.assertNotNull(resettableIteratorArray58);
        org.junit.Assert.assertNotNull(resettableIteratorItor59);
        org.junit.Assert.assertNotNull(resettableIteratorItor60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(annotatedElementItor62);
        org.junit.Assert.assertNotNull(objItor63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArrayItor68);
        org.junit.Assert.assertNotNull(typeArrayItor69);
        org.junit.Assert.assertNotNull(resettableIteratorItor70);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[], java.lang.Object[]> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArrayItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor7);
        org.junit.Assert.assertNotNull(objItorArrayItor8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[][][]> resettableIteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorItor8, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) genericDeclarationArrayItor0);
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor1);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator[], org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][]> typeArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.GenericDeclaration, org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[][]> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableItor2, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(strComparableItor2);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItorItor0);
        org.junit.Assert.assertNotNull(objItorItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[][][] strArray5 = new java.lang.String[][][] { strArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray5, 0);
        java.lang.Class<?> wildcardClass8 = strArrayItor7.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArrayItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1L, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIterator0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableListIterator, java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> resettableListIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIteratorItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorItor0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[][][] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[2][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][][] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][][]) orderedMapIteratorArray7;
        objItorArray8[0] = objItorArray2;
        objItorArray8[1] = objItorArray5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) objItorArray2, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(objItorArrayItor3);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator[]) resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorArrayItor10, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.collections4.OrderedIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.ResettableListIterator[][]> resettableListIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][][]> listIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (short) 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.collections4.OrderedIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.collections4.OrderedIterator[][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) orderedIteratorArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(annotatedElementArray0, 16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator<?>> wildcardItorItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator<?>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorItor8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(wildcardItorItor8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardItor6);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardItorItor7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) genericDeclarationArrayItor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor3);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) typeItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.ListIterator[][] listIteratorArray0 = new java.util.ListIterator[][] {};
        java.util.ListIterator[][][] listIteratorArray1 = new java.util.ListIterator[][][] { listIteratorArray0 };
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[][]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][]> listIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(listIteratorArray1);
        org.junit.Assert.assertNotNull(listIteratorArray0);
        org.junit.Assert.assertNotNull(listIteratorArray1);
        org.junit.Assert.assertNotNull(listIteratorArrayItor2);
        org.junit.Assert.assertNotNull(listIteratorArrayItor3);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
        org.junit.Assert.assertNotNull(objItorArrayItor19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.Type, java.lang.String> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor6);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strComparableItor4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray1 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor0 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor2 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray3 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor2 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray5 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor4 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray7 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor6 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor8 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray9 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor8 };
        org.apache.commons.collections4.ResettableIterator[][] resettableIteratorArray10 = new org.apache.commons.collections4.ResettableIterator[][] { resettableIteratorArray1, resettableIteratorArray3, resettableIteratorArray5, resettableIteratorArray7, resettableIteratorArray9 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor11 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray12 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor11 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor13 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray14 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor13 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor15 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray16 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor15 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor17 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray18 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor17 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor19 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray20 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor19 };
        org.apache.commons.collections4.ResettableIterator[][] resettableIteratorArray21 = new org.apache.commons.collections4.ResettableIterator[][] { resettableIteratorArray12, resettableIteratorArray14, resettableIteratorArray16, resettableIteratorArray18, resettableIteratorArray20 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor22 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray23 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor22 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor24 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray25 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor24 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor26 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray27 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor26 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor28 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray29 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor28 };
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor30 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray31 = new org.apache.commons.collections4.ResettableIterator[] { serializableItor30 };
        org.apache.commons.collections4.ResettableIterator[][] resettableIteratorArray32 = new org.apache.commons.collections4.ResettableIterator[][] { resettableIteratorArray23, resettableIteratorArray25, resettableIteratorArray27, resettableIteratorArray29, resettableIteratorArray31 };
        org.apache.commons.collections4.ResettableIterator[][][] resettableIteratorArray33 = new org.apache.commons.collections4.ResettableIterator[][][] { resettableIteratorArray10, resettableIteratorArray21, resettableIteratorArray32 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[][]> resettableIteratorArrayItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator> listIteratorItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorArray33, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(resettableIteratorArray1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(resettableIteratorArray3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(resettableIteratorArray5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(resettableIteratorArray7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(resettableIteratorArray9);
        org.junit.Assert.assertNotNull(resettableIteratorArray10);
        org.junit.Assert.assertNotNull(serializableItor11);
        org.junit.Assert.assertNotNull(resettableIteratorArray12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(resettableIteratorArray14);
        org.junit.Assert.assertNotNull(serializableItor15);
        org.junit.Assert.assertNotNull(resettableIteratorArray16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(resettableIteratorArray18);
        org.junit.Assert.assertNotNull(serializableItor19);
        org.junit.Assert.assertNotNull(resettableIteratorArray20);
        org.junit.Assert.assertNotNull(resettableIteratorArray21);
        org.junit.Assert.assertNotNull(serializableItor22);
        org.junit.Assert.assertNotNull(resettableIteratorArray23);
        org.junit.Assert.assertNotNull(serializableItor24);
        org.junit.Assert.assertNotNull(resettableIteratorArray25);
        org.junit.Assert.assertNotNull(serializableItor26);
        org.junit.Assert.assertNotNull(resettableIteratorArray27);
        org.junit.Assert.assertNotNull(serializableItor28);
        org.junit.Assert.assertNotNull(resettableIteratorArray29);
        org.junit.Assert.assertNotNull(serializableItor30);
        org.junit.Assert.assertNotNull(resettableIteratorArray31);
        org.junit.Assert.assertNotNull(resettableIteratorArray32);
        org.junit.Assert.assertNotNull(resettableIteratorArray33);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor34);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItorItor0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorItor0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[][]> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[][][]> resettableIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray0, strArray1 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.GenericDeclaration[][], java.util.ListIterator[][]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass5 = iteratorArray1.getClass();
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][][][]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator<?>> wildcardItorItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator<?>>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.Type[]> typeArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.Type[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(wildcardItorItor4);
        org.junit.Assert.assertNotNull(typeArrayItor5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[][]> itorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(itorItorArrayItor0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[][]> itorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(itorItorArrayItor0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray11);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor19);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor21);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        java.util.ListIterator<java.lang.reflect.Type[]> typeArrayItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor35 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[][]> resettableListIteratorArrayItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArray18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
        org.junit.Assert.assertNotNull(typeArrayItor34);
        org.junit.Assert.assertNotNull(annotatedElementItor35);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorArray0);
        java.lang.Class<?> wildcardClass4 = resettableIteratorArray0.getClass();
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(wildcardClassItor32);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>, java.util.ListIterator[]> objItorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItorItorItor0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArrayItor19, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
        org.junit.Assert.assertNotNull(objItorArrayItor19);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray6);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray6, 2);
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][][] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray11);
        java.lang.Class<?> wildcardClass20 = objItorArrayItor19.getClass();
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
        org.junit.Assert.assertNotNull(objItorArrayItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[], java.io.Serializable> itorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(itorItorArrayItor0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.GenericDeclaration[], java.util.ListIterator[][][]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.collections4.OrderedIterator<java.util.ListIterator> listIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(listIteratorItor0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[] { wildcardItorItor6 };
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableListIteratorArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        java.util.ListIterator<java.util.ListIterator[]> listIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.ListIterator[]) resettableListIteratorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator> listIteratorItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.ListIterator[]) resettableListIteratorArray7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor8);
        org.junit.Assert.assertNotNull(listIteratorItor9);
        org.junit.Assert.assertNotNull(listIteratorArrayItor10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray18, 3);
        java.lang.Class<?> wildcardClass36 = typeItor35.getClass();
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
        org.junit.Assert.assertNotNull(typeItor35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]> wildcardItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorArrayItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableIterator) listIteratorArrayItor0);
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[][]> itorItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArrayItor8, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor7);
        org.junit.Assert.assertNotNull(strArrayItor8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[][][]> resettableListIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[]> listIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (-1.0d), (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(genericDeclarationItor5);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.collections4.MapIterator[] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) mapIteratorArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) mapIteratorArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.Iterator[][] iteratorArray1 = new java.util.Iterator[0][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray1;
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) serializableItor0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][]> listIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.collections4.MapIterator<java.util.ListIterator[][][], org.apache.commons.collections4.ResettableIterator> listIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(listIteratorArrayItor0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray0 = null;
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray0);
        org.junit.Assert.assertNotNull(objItorArrayItor1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor36 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(wildcardClassItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11, 16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor35 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18, 0);
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
        org.junit.Assert.assertNotNull(annotatedElementItor35);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray2 = new org.apache.commons.collections4.ResettableListIterator[] { objItorItor0, wildcardClassArrayItor1 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray5 = new org.apache.commons.collections4.ResettableListIterator[] { objItorItor3, wildcardClassArrayItor4 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor6 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray8 = new org.apache.commons.collections4.ResettableListIterator[] { objItorItor6, wildcardClassArrayItor7 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray11 = new org.apache.commons.collections4.ResettableListIterator[] { objItorItor9, wildcardClassArrayItor10 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor12 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray14 = new org.apache.commons.collections4.ResettableListIterator[] { objItorItor12, wildcardClassArrayItor13 };
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray15 = new org.apache.commons.collections4.ResettableListIterator[][] { resettableListIteratorArray2, resettableListIteratorArray5, resettableListIteratorArray8, resettableListIteratorArray11, resettableListIteratorArray14 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator[]> resettableListIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableListIteratorArray15, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor1);
        org.junit.Assert.assertNotNull(resettableListIteratorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray5);
        org.junit.Assert.assertNotNull(objItorItor6);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor7);
        org.junit.Assert.assertNotNull(resettableListIteratorArray8);
        org.junit.Assert.assertNotNull(objItorItor9);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor10);
        org.junit.Assert.assertNotNull(resettableListIteratorArray11);
        org.junit.Assert.assertNotNull(objItorItor12);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor13);
        org.junit.Assert.assertNotNull(resettableListIteratorArray14);
        org.junit.Assert.assertNotNull(resettableListIteratorArray15);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][], org.apache.commons.collections4.ResettableListIterator[][][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor8 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(wildcardItor8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray11, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) wildcardClassArray11);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArray11, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor19);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor21);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonIterator(genericDeclarationArray5);
        java.util.ListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor8);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray4, strArray9, strArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray15, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>) objItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[][]> resettableIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationArrayItor1);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass4 = objItor3.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass6 = objItor5.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass8 = objItor7.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass10 = objItor9.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor11 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass12 = objItor11.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] { wildcardClass4, wildcardClass6, wildcardClass8, wildcardClass10, wildcardClass12 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray13, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor16 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableListIterator) genericDeclarationItor15);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor17 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray18 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableIteratorArray18);
        java.util.ListIterator[] listIteratorArray21 = new java.util.ListIterator[] { genericDeclarationArrayItor0, genericDeclarationArrayItor1, genericDeclarationItor15, genericDeclarationItor17, strComparableItor20 };
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator> listIteratorItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(listIteratorArray21);
        java.util.ListIterator<java.util.ListIterator[]> listIteratorArrayItor23 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(listIteratorArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) listIteratorArray21, 16, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(genericDeclarationItor15);
        org.junit.Assert.assertNotNull(resettableListIteratorItor16);
        org.junit.Assert.assertNotNull(genericDeclarationItor17);
        org.junit.Assert.assertNotNull(resettableIteratorArray18);
        org.junit.Assert.assertNotNull(resettableIteratorItor19);
        org.junit.Assert.assertNotNull(strComparableItor20);
        org.junit.Assert.assertNotNull(listIteratorArray21);
        org.junit.Assert.assertNotNull(listIteratorItor22);
        org.junit.Assert.assertNotNull(listIteratorArrayItor23);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][], org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableListIterator) genericDeclarationItor12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIteratorItor13, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
        org.junit.Assert.assertNotNull(resettableListIteratorItor13);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator[]> listIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator[]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor8 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(listIteratorArrayItor7);
        org.junit.Assert.assertNotNull(wildcardItor8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1;
        java.util.Iterator[] iteratorArray4 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[] wildcardItorArray5 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray4;
        java.util.Iterator[][] iteratorArray7 = new java.util.Iterator[2][];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray8 = (java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]) iteratorArray7;
        wildcardItorArray8[0] = wildcardItorArray2;
        wildcardItorArray8[1] = wildcardItorArray5;
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardItorArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItorArrayItor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(iteratorArray4);
        org.junit.Assert.assertNotNull(wildcardItorArray5);
        org.junit.Assert.assertNotNull(iteratorArray7);
        org.junit.Assert.assertNotNull(wildcardItorArray8);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor13);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[][] objItorItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[][]) zippingIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]> itorItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator> listIteratorItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) itorItorArrayItor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertNotNull(objItorItorArray2);
        org.junit.Assert.assertNotNull(itorItorArrayItor3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor2);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor3);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor4);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor5);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor5);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objItor7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray0 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray2 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray3 = new org.apache.commons.collections4.ResettableListIterator[][] { resettableListIteratorArray0, resettableListIteratorArray1, resettableListIteratorArray2 };
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray4 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray5 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[][] { resettableListIteratorArray4, resettableListIteratorArray5, resettableListIteratorArray6 };
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray8 = new org.apache.commons.collections4.ResettableListIterator[][][] { resettableListIteratorArray3, resettableListIteratorArray7 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[][]> resettableListIteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray8, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[][]> resettableListIteratorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray0);
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertNotNull(resettableListIteratorArray2);
        org.junit.Assert.assertNotNull(resettableListIteratorArray3);
        org.junit.Assert.assertNotNull(resettableListIteratorArray4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray5);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArray8);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) annotatedElementItor7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(annotatedElementItor7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItor6);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][]> wildcardItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 2, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.String[][]> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = annotatedElementItor0.getClass();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[][]>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.String[][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(wildcardItorArrayItor6);
        org.junit.Assert.assertNotNull(strArrayItor7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray18);
        java.util.ListIterator<java.lang.reflect.Type[]> typeArrayItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        java.util.ListIterator<java.lang.reflect.Type[]> typeArrayItor35 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        java.lang.Class<?> wildcardClass36 = wildcardClassArray18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass36, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor32);
        org.junit.Assert.assertNotNull(objArrayItor33);
        org.junit.Assert.assertNotNull(typeArrayItor34);
        org.junit.Assert.assertNotNull(typeArrayItor35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) objItorArray11, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray0 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray2 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray3 = new org.apache.commons.collections4.ResettableListIterator[][] { resettableListIteratorArray0, resettableListIteratorArray1, resettableListIteratorArray2 };
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray4 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray5 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[] {};
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[][] { resettableListIteratorArray4, resettableListIteratorArray5, resettableListIteratorArray6 };
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray8 = new org.apache.commons.collections4.ResettableListIterator[][][] { resettableListIteratorArray3, resettableListIteratorArray7 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[][]> resettableListIteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray8, 1, (int) (byte) 1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator[][]> resettableListIteratorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableListIteratorArray8, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator[][]> resettableIteratorArrayItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[][][]) resettableListIteratorArray8, 16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray0);
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertNotNull(resettableListIteratorArray2);
        org.junit.Assert.assertNotNull(resettableListIteratorArray3);
        org.junit.Assert.assertNotNull(resettableListIteratorArray4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray5);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(resettableListIteratorArray8);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArrayItor14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray1;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray5 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray4;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray8 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray7;
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][] objItorArray11 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) orderedMapIteratorArray10;
        objItorArray11[0] = orderedMapIteratorArray1;
        objItorArray11[1] = orderedMapIteratorArray4;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]> objItorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[][]) objItorArray11, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        java.lang.Class<?> wildcardClass32 = wildcardClassArray18.getClass();
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeItor31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray6 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray6);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator> listIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) typeArrayItor8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArrayItor7);
        org.junit.Assert.assertNotNull(typeArrayItor8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Class<?>[]> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItor0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.collections4.OrderedIterator<java.lang.String[][]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        java.util.ListIterator<java.lang.reflect.Type[]> typeArrayItor31 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type[]) wildcardClassArray18);
        java.util.Iterator<?> wildcardItor32 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) typeArrayItor31);
        java.util.Iterator<?> wildcardItor33 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) typeArrayItor31);
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(typeArrayItor31);
        org.junit.Assert.assertNotNull(wildcardItor32);
        org.junit.Assert.assertNotNull(wildcardItor33);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.collections4.OrderedIterator<java.lang.reflect.Type> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator[][][][][]> listIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) typeItor0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator[][][][]> listIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0.0f, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[], java.lang.Comparable<java.lang.String>> itorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(itorItorArrayItor0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator, org.apache.commons.collections4.ResettableIterator[]> resettableListIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = resettableListIteratorItor0.getClass();
        org.junit.Assert.assertNotNull(resettableListIteratorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<?>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator<?>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator[]> listIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>[][]> wildcardClassArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][]> strArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(objItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(listIteratorArrayItor7);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(objItor1);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray4 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray4);
        java.lang.Class<?> wildcardClass7 = resettableIteratorItor6.getClass();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray8 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray8);
        java.lang.Class<?> wildcardClass11 = resettableIteratorItor10.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass13 = objItor12.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass15 = objItor14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass13;
        wildcardClassArray18[4] = wildcardClass15;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray18, 5);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        java.util.Iterator<?> wildcardItor33 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardClassArray18);
        java.util.ListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor37 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray18, 16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resettableIteratorArray4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(resettableIteratorArray8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertNotNull(annotatedElementItor31);
        org.junit.Assert.assertNotNull(genericDeclarationItor32);
        org.junit.Assert.assertNotNull(wildcardItor33);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor34);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]> itorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(itorItorArrayItor0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (-1L), 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[][] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}


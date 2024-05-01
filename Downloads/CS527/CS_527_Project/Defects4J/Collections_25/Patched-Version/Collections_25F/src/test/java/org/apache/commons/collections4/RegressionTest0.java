package org.apache.commons.collections4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (byte) -1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableItor1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strComparableItor2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 100, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Iterator[] iteratorArray0 = new java.util.Iterator[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArrayItor3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(strComparableComparatorItor0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 100, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) listIterator0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator1 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) ' ', (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Iterator<?>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.zippingIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[] { wildcardClass1, wildcardClass3, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(annotatedElementArray6, (int) '#', (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(annotatedElementArray6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItorItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections4.MapIterator<java.util.Iterator, java.lang.reflect.AnnotatedElement> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(iteratorItor0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1L, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator[]> iteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArrayItor0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArrayItor0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = null;
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator(obj0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor1 = null;
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = charSequenceItorReverseComparator0.compare(charSequenceItor1, charSequenceItor7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.ObjectArrayIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceItor7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator3 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator4 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean6 = charSequenceItorReverseComparator4.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator7 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean9 = charSequenceItorReverseComparator7.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator10 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean12 = charSequenceItorReverseComparator10.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator13 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean15 = charSequenceItorReverseComparator13.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.comparators.ReverseComparator[] reverseComparatorArray17 = new org.apache.commons.collections4.comparators.ReverseComparator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>[] charSequenceItorReverseComparatorArray18 = (org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>[]) reverseComparatorArray17;
        charSequenceItorReverseComparatorArray18[0] = charSequenceItorReverseComparator0;
        charSequenceItorReverseComparatorArray18[1] = charSequenceItorReverseComparator3;
        charSequenceItorReverseComparatorArray18[2] = charSequenceItorReverseComparator4;
        charSequenceItorReverseComparatorArray18[3] = charSequenceItorReverseComparator7;
        charSequenceItorReverseComparatorArray18[4] = charSequenceItorReverseComparator10;
        charSequenceItorReverseComparatorArray18[5] = charSequenceItorReverseComparator13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorReverseComparatorArray18, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reverseComparatorArray17);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorArray18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor2 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList1);
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorItor2);
        org.junit.Assert.assertNotNull(wildcardItor3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(iteratorArrayItor0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections4.MapIterator mapIterator0 = org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean3 = iteratorItor2.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator4 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { mapIterator0, iteratorItor1, iteratorItor2, orderedMapIterator4 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray5, 0);
        org.junit.Assert.assertNotNull(mapIterator0);
        org.junit.Assert.assertNotNull(iteratorItor1);
        org.junit.Assert.assertNotNull(iteratorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(mapIteratorItor7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(mapIteratorItor0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean8 = strItor7.hasNext();
        int int9 = strItor7.nextIndex();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor7);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor12 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.CharSequence) "");
        java.util.Iterator[] iteratorArray13 = new java.util.Iterator[] { strItor0, orderedMapIterator6, strItor10, charSequenceItor12 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor14 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean15 = strItor14.hasNext();
        int int16 = strItor14.nextIndex();
        boolean boolean17 = strItor14.hasPrevious();
        boolean boolean18 = strItor14.hasPrevious();
        int int19 = strItor14.nextIndex();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator20 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor21 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean22 = strItor21.hasNext();
        int int23 = strItor21.nextIndex();
        java.util.ListIterator<java.lang.String> strItor24 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor21);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor26 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.CharSequence) "");
        java.util.Iterator[] iteratorArray27 = new java.util.Iterator[] { strItor14, orderedMapIterator20, strItor24, charSequenceItor26 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor28 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean29 = strItor28.hasNext();
        int int30 = strItor28.nextIndex();
        boolean boolean31 = strItor28.hasPrevious();
        boolean boolean32 = strItor28.hasPrevious();
        int int33 = strItor28.nextIndex();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator34 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor35 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean36 = strItor35.hasNext();
        int int37 = strItor35.nextIndex();
        java.util.ListIterator<java.lang.String> strItor38 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor35);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor40 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.CharSequence) "");
        java.util.Iterator[] iteratorArray41 = new java.util.Iterator[] { strItor28, orderedMapIterator34, strItor38, charSequenceItor40 };
        java.util.Iterator[][] iteratorArray42 = new java.util.Iterator[][] { iteratorArray13, iteratorArray27, iteratorArray41 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor44 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray42, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(charSequenceItor12);
        org.junit.Assert.assertNotNull(iteratorArray13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(orderedMapIterator20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(charSequenceItor26);
        org.junit.Assert.assertNotNull(iteratorArray27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(orderedMapIterator34);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(charSequenceItor40);
        org.junit.Assert.assertNotNull(iteratorArray41);
        org.junit.Assert.assertNotNull(iteratorArray42);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections4.MapIterator[] mapIteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray0, (int) (byte) 10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence[]> charSequenceArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[] charSequenceItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections4.OrderedIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) boolean1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardItor2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections4.MapIterator[] mapIteratorArray0 = null;
        java.util.ListIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(mapIteratorArray0);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charSequenceItor1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) typeItor0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardItorList2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections4.ResettableIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(mapIteratorComparatorArrayItor0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator2);
        int int15 = strComparableComparator2.compare("", "");
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>, java.lang.CharSequence> iteratorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(iteratorItorItor0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, java.lang.reflect.AnnotatedElement> charSequenceItorReverseComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.GenericDeclaration[], java.util.Iterator> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(mapIteratorArrayItor0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>[] wildcardItorIterableArray2 = (java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>[]) iterableArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>[]) iterableArray1);
        org.junit.Assert.assertNotNull(iterableArray1);
        org.junit.Assert.assertNotNull(wildcardItorIterableArray2);
        org.junit.Assert.assertNotNull(wildcardItorIterableItor3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator[]> iteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Iterable[]> iterableArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArrayItor0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor4 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorItor4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ReverseComparator[] reverseComparatorArray4 = new org.apache.commons.collections4.comparators.ReverseComparator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>[] charSequenceItorReverseComparatorArray5 = (org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>[]) reverseComparatorArray4;
        charSequenceItorReverseComparatorArray5[0] = charSequenceItorReverseComparator0;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorReverseComparatorArray5, 3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(reverseComparatorArray4);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorArray5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator1 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean2 = strComparableComparator0.equals((java.lang.Object) strComparableComparator1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableComparator1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence[]> charSequenceArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArray8, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceArray4, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        java.util.ListIterator listIterator2 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int3 = listIterator2.nextIndex();
        java.util.ListIterator[] listIteratorArray5 = new java.util.ListIterator[2];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray6 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray5;
        strItorArray6[0] = listIterator0;
        strItorArray6[1] = listIterator2;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>> strItorItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray6, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIteratorArray5);
        org.junit.Assert.assertNotNull(strItorArray6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Comparable<java.lang.String>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableItor0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableItor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Comparator<java.lang.String>> strComparatorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIterator0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.RESETTABLE_INSTANCE;
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray2 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray3 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray2;
        strItorArray3[0] = resettableListIterator0;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray3, (int) (short) 100, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(resettableListIteratorArray2);
        org.junit.Assert.assertNotNull(strItorArray3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections4.ResettableIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardItorIterableItor0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.util.ListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericDeclarationItor2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean2 = iteratorItor1.hasPrevious();
        boolean boolean3 = iteratorItor1.hasPrevious();
        boolean boolean4 = iteratorItor1.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor5 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean6 = iteratorItor5.hasPrevious();
        boolean boolean7 = iteratorItor5.hasPrevious();
        boolean boolean8 = iteratorItor5.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator9 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean11 = iteratorItor10.hasPrevious();
        boolean boolean12 = iteratorItor10.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator13 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray15 = new org.apache.commons.collections4.OrderedMapIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[] iteratorItorArray16 = (org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[]) orderedMapIteratorArray15;
        iteratorItorArray16[0] = orderedMapIterator0;
        iteratorItorArray16[1] = iteratorItor1;
        iteratorItorArray16[2] = iteratorItor5;
        iteratorItorArray16[3] = orderedMapIterator9;
        iteratorItorArray16[4] = iteratorItor10;
        iteratorItorArray16[5] = orderedMapIterator13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorItorArray16, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIterator0);
        org.junit.Assert.assertNotNull(iteratorItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iteratorItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator9);
        org.junit.Assert.assertNotNull(iteratorItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator13);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray15);
        org.junit.Assert.assertNotNull(iteratorItorArray16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray12 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11;
        java.util.Iterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray16 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray17 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray16;
        charSequenceArrayItorArray17[0] = charSequenceArrayItor4;
        charSequenceArrayItorArray17[1] = charSequenceArrayItor9;
        charSequenceArrayItorArray17[2] = charSequenceArrayItor14;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArrayItorArray17);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(wildcardItorArray12);
        org.junit.Assert.assertNotNull(strArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(zippingIteratorArray16);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray17);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor24);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItor4, (int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor3 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList2);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(wildcardItorItor3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(strItor0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.lang.Class<?> wildcardClass10 = strComparableComparator4.getClass();
        java.util.ListIterator<java.lang.reflect.Type> typeItor11 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.Type) wildcardClass10);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeItor11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>[] wildcardItorIterableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorIterableArray0, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        boolean boolean1 = orderedMapIterator0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) boolean1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIterator0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItor1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strComparableComparatorItor0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.Class<?> wildcardClass13 = strItor7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Iterator[][] iteratorArray0 = new java.util.Iterator[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        java.lang.String str11 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator7 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean10 = strComparableComparator8.equals((java.lang.Object) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator12 = strComparator11.reversed();
        java.util.Comparator<java.lang.String> strComparator13 = strComparator12.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator13, 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strComparableItor5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator2);
        int int15 = strComparableComparator2.compare("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) int15, 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray12 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11;
        java.util.Iterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray11);
        java.util.Iterator[] iteratorArray16 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray17 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray16;
        java.util.Iterator<java.lang.String[]> strArrayItor18 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray16);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor19 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray16);
        java.util.Iterator[] iteratorArray21 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray22 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray21;
        java.util.Iterator<java.lang.String[]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray21);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor24 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray21);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray26 = new org.apache.commons.collections4.iterators.ZippingIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray27 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray26;
        charSequenceArrayItorArray27[0] = charSequenceArrayItor4;
        charSequenceArrayItorArray27[1] = charSequenceArrayItor9;
        charSequenceArrayItorArray27[2] = charSequenceArrayItor14;
        charSequenceArrayItorArray27[3] = charSequenceArrayItor19;
        charSequenceArrayItorArray27[4] = charSequenceArrayItor24;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray27);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(wildcardItorArray12);
        org.junit.Assert.assertNotNull(strArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(iteratorArray16);
        org.junit.Assert.assertNotNull(wildcardItorArray17);
        org.junit.Assert.assertNotNull(strArrayItor18);
        org.junit.Assert.assertNotNull(charSequenceArrayItor19);
        org.junit.Assert.assertNotNull(iteratorArray21);
        org.junit.Assert.assertNotNull(wildcardItorArray22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(charSequenceArrayItor24);
        org.junit.Assert.assertNotNull(zippingIteratorArray26);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray27);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor38);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        int int9 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) boolean12, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        charSequenceItor5.reset();
        java.lang.Class<?> wildcardClass7 = charSequenceItor5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "", "", "hi!", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray13, charSequenceArray20, charSequenceArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence[]> charSequenceArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArray28, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[][] {};
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2, genericDeclarationArray3, genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray5, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.ListIterator<java.lang.String> strItor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ListIterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections4.OrderedIterator<java.util.Comparator<java.lang.String>> strComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strComparatorItor0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>, java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItorItor0, 2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, org.apache.commons.collections4.MapIterator> charSequenceItorReverseComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray3, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strComparableComparatorItor0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor7 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparableComparatorItor7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>, java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> typeItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItorItor0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections4.MapIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>, java.lang.Class<?>> wildcardItorCollectionItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorCollectionItor0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator[]> iteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(iteratorItorItor5);
        org.junit.Assert.assertNotNull(strItorItor6);
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertNotNull(iteratorArrayItor8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections4.MapIterator[] mapIteratorArray0 = new org.apache.commons.collections4.MapIterator[] {};
        org.apache.commons.collections4.MapIterator[] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[] {};
        org.apache.commons.collections4.MapIterator[] mapIteratorArray2 = new org.apache.commons.collections4.MapIterator[] {};
        org.apache.commons.collections4.MapIterator[] mapIteratorArray3 = new org.apache.commons.collections4.MapIterator[] {};
        org.apache.commons.collections4.MapIterator[] mapIteratorArray4 = new org.apache.commons.collections4.MapIterator[] {};
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[][] { mapIteratorArray0, mapIteratorArray1, mapIteratorArray2, mapIteratorArray3, mapIteratorArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray5, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray0);
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertNotNull(mapIteratorArray2);
        org.junit.Assert.assertNotNull(mapIteratorArray3);
        org.junit.Assert.assertNotNull(mapIteratorArray4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass2 = charSequenceItor1.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        int int6 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor5);
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArrayItorArray2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray2);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        int int6 = strItor0.previousIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        org.apache.commons.collections4.ResettableListIterator resettableListIterator3 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean5 = strItor4.hasNext();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray7 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray8 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray7;
        strItorArray8[0] = strItor0;
        strItorArray8[1] = resettableListIterator3;
        strItorArray8[2] = strItor4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray8, (int) (short) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(resettableListIterator3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resettableListIteratorArray7);
        org.junit.Assert.assertNotNull(strItorArray8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "hi!", "", "" };
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray7, charSequenceArray11, charSequenceArray15, charSequenceArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence[]> charSequenceArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray20, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.collections4.MapIterator<java.util.Iterator, java.lang.reflect.AnnotatedElement> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, java.lang.reflect.AnnotatedElement> charSequenceItorReverseComparatorItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        boolean boolean3 = orderedMapIterator2.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>, java.lang.CharSequence[]> strItorItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { iteratorItor0, charSequenceItorReverseComparatorItor1, orderedMapIterator2, strItorItor4 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray5, (int) (short) 0, 2);
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor1);
        org.junit.Assert.assertNotNull(orderedMapIterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItorItor4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(mapIteratorItor8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections4.MapIterator<java.lang.String[], java.lang.reflect.Type> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections4.MapIterator[] mapIteratorArray0 = new org.apache.commons.collections4.MapIterator[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        int int6 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>, org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> strComparableComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(strComparableComparatorItor0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator11, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(typeItorItor0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int21 = strComparableComparator18.compare("hi!", "hi!");
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator18);
        int int25 = strComparableComparator18.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator27 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator comparator29 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator26.thenComparing((java.util.Comparator<java.lang.String>) comparator29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) comparator29, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(strComparator30);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (byte) -1, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(iteratorItorItor0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator7 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean10 = strComparableComparator8.equals((java.lang.Object) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator12 = strComparator11.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator7 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean10 = strComparableComparator8.equals((java.lang.Object) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator12 = strComparator11.reversed();
        java.util.Comparator<java.lang.String> strComparator13 = strComparator12.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.collections4.MapIterator<java.lang.CharSequence, java.util.Iterator[]> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int16 = strComparableComparator12.compare("hi!", "hi!");
        int int19 = strComparableComparator12.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator20 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray26);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray26);
        java.lang.Class<?> wildcardClass29 = objItor28.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor30 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass29);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator31 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean33 = charSequenceItorReverseComparator31.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray37);
        boolean boolean39 = strItor38.hasPrevious();
        boolean boolean40 = strItor38.hasNext();
        int int41 = strItor38.previousIndex();
        java.lang.String str42 = strItor38.next();
        boolean boolean43 = charSequenceItorReverseComparator31.equals((java.lang.Object) strItor38);
        java.lang.Class<?> wildcardClass44 = strItor38.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator49 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int52 = strComparableComparator49.compare("hi!", "hi!");
        java.lang.String str53 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator49);
        java.lang.String str54 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator49);
        java.lang.Class<?> wildcardClass55 = strComparableComparator49.getClass();
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor56 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass57 = charSequenceItorItor56.getClass();
        java.lang.Class[] classArray59 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass29;
        wildcardClassArray60[1] = wildcardClass44;
        wildcardClassArray60[2] = wildcardClass55;
        wildcardClassArray60[3] = wildcardClass57;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor71 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray60, (int) (byte) 0, (int) (short) 0);
        boolean boolean72 = strComparableComparator12.equals((java.lang.Object) wildcardClassItor71);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClassItor30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(strComparableComparator49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(charSequenceItorItor56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassItor71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, org.apache.commons.collections4.MapIterator> charSequenceItorReverseComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, java.lang.reflect.AnnotatedElement> charSequenceItorReverseComparatorItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator mapIterator2 = org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>, java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor5 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean6 = iteratorItor5.hasPrevious();
        boolean boolean7 = iteratorItor5.hasPrevious();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[] { charSequenceItorReverseComparatorItor0, charSequenceItorReverseComparatorItor1, mapIterator2, typeItorItor3, serializableItor4, iteratorItor5 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray8, 0);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor0);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor1);
        org.junit.Assert.assertNotNull(mapIterator2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(iteratorItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
        org.junit.Assert.assertNotNull(mapIteratorItor10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>, java.lang.CharSequence[]> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItorItor0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceItor0, (-3), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Comparator comparator2 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str3 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) comparator2);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) comparator2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator4, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strComparator4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceArrayItorArrayItor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray2);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) int5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray8, (int) (byte) 0, 1);
        java.util.ListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor13 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][][]> genericDeclarationArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItor4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<java.lang.reflect.AnnotatedElement> annotatedElementItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(annotatedElementItor5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections4.OrderedIterator<java.lang.CharSequence[]> charSequenceArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItor0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardClassItor0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray8, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
        org.junit.Assert.assertNotNull(objItor13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        boolean boolean3 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        // The following exception was thrown during execution in test generation
        try {
            strItor5.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) str9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardItor10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2, genericDeclarationArray3, genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) genericDeclarationArray5, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int18 = strComparableComparator15.compare("hi!", "hi!");
        java.lang.String str19 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        int int22 = strComparableComparator15.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator24 = strComparableComparator15.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator12.thenComparing(strComparator24);
        java.util.Comparator<java.lang.String> strComparator26 = strComparableComparator10.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.util.Comparator<java.lang.String> strComparator27 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator27, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>[] charSequenceItorComparatorArray2 = (java.util.Comparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>[]) comparatorArray1;
        java.util.Comparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator(charSequenceItorComparatorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceItorComparator3, (-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(charSequenceItorComparatorArray2);
        org.junit.Assert.assertNotNull(charSequenceItorComparator3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>, java.lang.Class<?>> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        java.lang.String str6 = strItor4.previous();
        boolean boolean7 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray5, strArray11, strArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Comparator comparator0 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator1 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator4 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str5 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "hi!", (java.util.Comparator<java.lang.String>) comparator4);
        java.util.Comparator comparator6 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator7 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator8 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator[] comparatorArray10 = new java.util.Comparator[6];
        @SuppressWarnings("unchecked")
        java.util.Comparator<org.apache.commons.collections4.MapIterator>[] mapIteratorComparatorArray11 = (java.util.Comparator<org.apache.commons.collections4.MapIterator>[]) comparatorArray10;
        mapIteratorComparatorArray11[0] = comparator0;
        mapIteratorComparatorArray11[1] = comparator1;
        mapIteratorComparatorArray11[2] = comparator4;
        mapIteratorComparatorArray11[3] = comparator6;
        mapIteratorComparatorArray11[4] = comparator7;
        mapIteratorComparatorArray11[5] = comparator8;
        java.util.Comparator<org.apache.commons.collections4.MapIterator> mapIteratorComparator24 = org.apache.commons.collections4.ComparatorUtils.chainedComparator(mapIteratorComparatorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) mapIteratorComparator24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparatorArray10);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArray11);
        org.junit.Assert.assertNotNull(mapIteratorComparator24);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int18 = strComparableComparator15.compare("hi!", "hi!");
        java.lang.String str19 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        int int22 = strComparableComparator15.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator24 = strComparableComparator15.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator12.thenComparing(strComparator24);
        java.util.Comparator<java.lang.String> strComparator26 = strComparableComparator10.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.util.Comparator<java.lang.String> strComparator27 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator10);
        java.util.ListIterator<java.io.Serializable> serializableItor28 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.io.Serializable) strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(serializableItor28);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Comparator comparator2 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str3 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) comparator2);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) comparator2);
        java.util.Iterator<?> wildcardItor5 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strComparator4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator4, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(wildcardItor5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        int int14 = strComparableComparator2.compare("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][][]> genericDeclarationArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) "hi!", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Comparator<java.lang.String> strComparator0 = null;
        java.util.Comparator<java.lang.String> strComparator1 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator2 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator3 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator2, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator2);
        org.junit.Assert.assertNotNull(strComparator3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections4.iterators.CollatingIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceItorItor0, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator6 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int9 = strComparableComparator6.compare("hi!", "hi!");
        java.lang.String str10 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator6);
        int int13 = strComparableComparator6.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator14 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator6);
        boolean boolean15 = strComparableComparator3.equals((java.lang.Object) strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator29 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator21);
        boolean boolean30 = strComparableComparator18.equals((java.lang.Object) strComparator29);
        java.util.Comparator<java.lang.String> strComparator31 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator18);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray33 = new org.apache.commons.collections4.comparators.ComparableComparator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray34 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray33;
        strComparableComparatorArray34[0] = strComparableComparator0;
        strComparableComparatorArray34[1] = strComparableComparator3;
        strComparableComparatorArray34[2] = strComparableComparator18;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor41 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray34);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertNotNull(strComparableComparator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(comparableComparatorArray33);
        org.junit.Assert.assertNotNull(strComparableComparatorArray34);
        org.junit.Assert.assertNotNull(strComparableComparatorItor41);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections4.OrderedIterator<java.lang.String>[] strItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor0);
        boolean boolean3 = iteratorItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator4 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator> iteratorItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        boolean boolean15 = strComparableComparator0.equals((java.lang.Object) iteratorItor14);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(iteratorItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor0);
        boolean boolean3 = iteratorItor0.hasPrevious();
        boolean boolean4 = iteratorItor0.hasPrevious();
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray5, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray8 = new org.apache.commons.collections4.comparators.ComparableComparator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray9 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray8;
        strComparableComparatorArray9[0] = strComparableComparator2;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(comparableComparatorArray8);
        org.junit.Assert.assertNotNull(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparatorItor12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>, org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceArrayItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor0.previousIndex();
        boolean boolean5 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        boolean boolean6 = listIterator0.hasPrevious();
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.reflect.AnnotatedElement> annotatedElementItor1 = org.apache.commons.collections4.IteratorUtils.chainedIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.collections4.MapIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>, java.lang.CharSequence> wildcardItorListItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorListItor0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator9 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean11 = charSequenceItorReverseComparator9.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray15);
        boolean boolean17 = strItor16.hasPrevious();
        boolean boolean18 = strItor16.hasNext();
        int int19 = strItor16.previousIndex();
        java.lang.String str20 = strItor16.next();
        boolean boolean21 = charSequenceItorReverseComparator9.equals((java.lang.Object) strItor16);
        java.lang.Class<?> wildcardClass22 = strItor16.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.String str32 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass33 = strComparableComparator27.getClass();
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor34 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass35 = charSequenceItorItor34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass7;
        wildcardClassArray38[1] = wildcardClass22;
        wildcardClassArray38[2] = wildcardClass33;
        wildcardClassArray38[3] = wildcardClass35;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor52 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray38, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(charSequenceItorItor34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassItor49);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator2);
        int int15 = strComparableComparator2.compare("hi!", "hi!");
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int21 = strComparableComparator18.compare("hi!", "hi!");
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator18);
        int int25 = strComparableComparator18.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator27 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator comparator29 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator26.thenComparing((java.util.Comparator<java.lang.String>) comparator29);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparator26);
        int int34 = strComparableComparator26.compare("hi!", "");
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparableComparatorItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        boolean boolean6 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Iterator<? extends java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.ZippingIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor1 = org.apache.commons.collections4.IteratorUtils.zippingIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        // The following exception was thrown during execution in test generation
        try {
            listIterator0.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor0.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorItor0, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator17 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int23 = strComparableComparator20.compare("hi!", "hi!");
        java.lang.String str24 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator20);
        int int27 = strComparableComparator20.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator28 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator20);
        boolean boolean29 = strComparableComparator17.equals((java.lang.Object) strComparator28);
        java.lang.String str30 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator17);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator33 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int36 = strComparableComparator33.compare("hi!", "hi!");
        java.lang.String str37 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator33);
        int int40 = strComparableComparator33.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator41 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator42 = strComparableComparator33.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator41);
        java.util.Comparator<java.lang.String> strComparator43 = strComparableComparator17.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator41);
        java.util.Comparator comparator44 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator45 = strComparableComparator41.thenComparing((java.util.Comparator<java.lang.String>) comparator44);
        java.lang.String str46 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator41);
        boolean boolean47 = charSequenceItorReverseComparator0.equals((java.lang.Object) str46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableComparator17);
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strComparableComparator33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator41);
        org.junit.Assert.assertNotNull(strComparator42);
        org.junit.Assert.assertNotNull(strComparator43);
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertNotNull(strComparator45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        charSequenceItor0.reset();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor14 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator15 = strComparableComparator4.reversed();
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.min("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.ResettableIterator resettableIterator3 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor4 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = charSequenceItorReverseComparator0.compare((org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator3, charSequenceItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.EmptyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(resettableIterator3);
        org.junit.Assert.assertNotNull(charSequenceItor4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.Collection[] collectionArray3 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[] wildcardItorCollectionArray4 = (java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[]) collectionArray3;
        wildcardItorCollectionArray4[0] = wildcardItorList1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardItorCollectionArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(collectionArray3);
        org.junit.Assert.assertNotNull(wildcardItorCollectionArray4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator7 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean10 = strComparableComparator8.equals((java.lang.Object) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator12 = strComparator11.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.Serializable[] serializableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections4.MapIterator<java.util.Iterator, java.util.Iterator[]> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(iteratorItor0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>> strItorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray3, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strItorItor7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        boolean boolean2 = iteratorItor0.hasPrevious();
        boolean boolean3 = iteratorItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator4 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray4);
        java.lang.String str6 = strItor5.next();
        boolean boolean7 = strItor5.hasPrevious();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean9 = strItor8.hasNext();
        int int10 = strItor8.nextIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor8);
        int int12 = strItor8.previousIndex();
        boolean boolean13 = strItor8.hasPrevious();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray17);
        boolean boolean19 = strItor18.hasPrevious();
        boolean boolean20 = strItor18.hasNext();
        int int21 = strItor18.previousIndex();
        java.lang.String str22 = strItor18.next();
        strItor18.set("hi!");
        strItor18.set("");
        java.lang.String str27 = strItor18.previous();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor28 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean29 = strItor28.hasNext();
        int int30 = strItor28.nextIndex();
        java.util.ListIterator<java.lang.String> strItor31 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor28);
        int int32 = strItor28.previousIndex();
        boolean boolean33 = strItor28.hasPrevious();
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray35 = new org.apache.commons.collections4.OrderedIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.String>[] strItorArray36 = (org.apache.commons.collections4.OrderedIterator<java.lang.String>[]) orderedIteratorArray35;
        strItorArray36[0] = strItor0;
        strItorArray36[1] = strItor5;
        strItorArray36[2] = strItor8;
        strItorArray36[3] = strItor18;
        strItorArray36[4] = strItor28;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray36, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strItor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(orderedIteratorArray35);
        org.junit.Assert.assertNotNull(strItorArray36);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator2 = typeItor0.getComparator();
        boolean boolean3 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        org.apache.commons.collections4.iterators.CollatingIterator[] collatingIteratorArray6 = new org.apache.commons.collections4.iterators.CollatingIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[] typeItorArray7 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]) collatingIteratorArray6;
        typeItorArray7[0] = typeItor0;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeItorArray7, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardComparator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertNotNull(collatingIteratorArray6);
        org.junit.Assert.assertNotNull(typeItorArray7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator10 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator2, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparator10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray10);
        charSequenceItor11.reset();
        charSequenceItor11.reset();
        org.apache.commons.collections4.ResettableIterator resettableIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        resettableIterator14.reset();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceItorReverseComparator0.compare(charSequenceItor11, (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.EmptyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceItor11);
        org.junit.Assert.assertNotNull(resettableIterator14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int21 = strComparableComparator18.compare("hi!", "hi!");
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator18);
        int int25 = strComparableComparator18.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator27 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator comparator29 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator26.thenComparing((java.util.Comparator<java.lang.String>) comparator29);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparator26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Comparator<java.lang.String>> strComparatorItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator26, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparableComparatorItor31);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator9 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean11 = charSequenceItorReverseComparator9.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray15);
        boolean boolean17 = strItor16.hasPrevious();
        boolean boolean18 = strItor16.hasNext();
        int int19 = strItor16.previousIndex();
        java.lang.String str20 = strItor16.next();
        boolean boolean21 = charSequenceItorReverseComparator9.equals((java.lang.Object) strItor16);
        java.lang.Class<?> wildcardClass22 = strItor16.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.String str32 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass33 = strComparableComparator27.getClass();
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor34 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass35 = charSequenceItorItor34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass7;
        wildcardClassArray38[1] = wildcardClass22;
        wildcardClassArray38[2] = wildcardClass33;
        wildcardClassArray38[3] = wildcardClass35;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38, (int) (byte) 0, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor50 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor51 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(charSequenceItorItor34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassItor49);
        org.junit.Assert.assertNotNull(wildcardClassItor50);
        org.junit.Assert.assertNotNull(wildcardClassItor51);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence[]> charSequenceArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray3, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator(iteratorItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator2 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertNotNull(iteratorItorItor1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        strItor7.set("hi!");
        strItor7.set("");
        java.lang.String str16 = strItor7.next();
        boolean boolean17 = strItor7.hasNext();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray21);
        boolean boolean23 = strItor22.hasPrevious();
        boolean boolean24 = strItor22.hasPrevious();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor25 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean26 = strItor25.hasNext();
        int int27 = strItor25.nextIndex();
        boolean boolean28 = strItor25.hasPrevious();
        boolean boolean29 = strItor25.hasPrevious();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray33);
        boolean boolean35 = strItor34.hasPrevious();
        int int36 = strItor34.previousIndex();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray38 = new org.apache.commons.collections4.ResettableListIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray39 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray38;
        strItorArray39[0] = strItor0;
        strItorArray39[1] = strItor7;
        strItorArray39[2] = strItor22;
        strItorArray39[3] = strItor25;
        strItorArray39[4] = strItor34;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor52 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray39, 5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(resettableListIteratorArray38);
        org.junit.Assert.assertNotNull(strItorArray39);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration[]> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor3.previousIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(iteratorItorItor0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        boolean boolean11 = strItor4.hasNext();
        java.util.Iterator<?> wildcardItor12 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardItor12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        java.lang.Class<?> wildcardClass9 = wildcardClassItor8.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        int int14 = strComparableComparator10.compare("hi!", "hi!");
        int int17 = strComparableComparator10.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator18 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator10);
        java.util.ListIterator<java.io.Serializable> serializableItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.io.Serializable) strComparableComparator10);
        java.util.Comparator<java.lang.String> strComparator20 = strComparableComparator10.reversed();
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(serializableItor19);
        org.junit.Assert.assertNotNull(strComparator20);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(charSequenceItorItor0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        java.lang.String str12 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator13 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator5.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator13);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator5);
        int int18 = strComparableComparator5.compare("", "hi!");
        boolean boolean19 = strComparableComparator2.equals((java.lang.Object) strComparableComparator5);
        java.lang.String str20 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray23);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray23);
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray27);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray27);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArray27);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor34 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean35 = typeItor34.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator36 = typeItor34.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList37 = typeItor34.getIterators();
        boolean boolean38 = charSequenceItorReverseComparator0.equals((java.lang.Object) typeItor34);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = typeItor34.getIteratorIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value has been returned yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceItor24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor28);
        org.junit.Assert.assertNotNull(genericDeclarationItor31);
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(wildcardComparator36);
        org.junit.Assert.assertNotNull(wildcardItorList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>, java.lang.CharSequence[]> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[] { strItorItor0 };
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>, java.lang.CharSequence[]> strItorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray3 = new org.apache.commons.collections4.MapIterator[] { strItorItor2 };
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>, java.lang.CharSequence[]> strItorItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { strItorItor4 };
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>, java.lang.CharSequence[]> strItorItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray7 = new org.apache.commons.collections4.MapIterator[] { strItorItor6 };
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[][] { mapIteratorArray1, mapIteratorArray3, mapIteratorArray5, mapIteratorArray7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItorItor0);
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertNotNull(strItorItor2);
        org.junit.Assert.assertNotNull(mapIteratorArray3);
        org.junit.Assert.assertNotNull(strItorItor4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(strItorItor6);
        org.junit.Assert.assertNotNull(mapIteratorArray7);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        boolean boolean2 = iteratorItor0.hasPrevious();
        boolean boolean3 = iteratorItor0.hasPrevious();
        boolean boolean4 = iteratorItor0.hasPrevious();
        boolean boolean5 = iteratorItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator6 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int7 = strItor6.previousIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray8, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) genericDeclarationArray8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
        org.junit.Assert.assertNotNull(objItor13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator13 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator5.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator13);
        java.util.Comparator<java.lang.String> strComparator15 = strComparableComparator2.thenComparing(strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator14);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "hi!", strComparator14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) str17, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        boolean boolean9 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        java.util.ListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        boolean boolean10 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.collections4.OrderedIterator<java.io.Serializable> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[], java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> strComparableComparatorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int21 = strComparableComparator18.compare("hi!", "hi!");
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator18);
        int int25 = strComparableComparator18.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator27 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator comparator29 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator26.thenComparing((java.util.Comparator<java.lang.String>) comparator29);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparator26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableComparatorItor31, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparableComparatorItor31);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int3 = strComparableComparator0.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparableComparator4.thenComparing(strComparator16);
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator21);
        int int34 = strComparableComparator21.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator36 = strComparator35.reversed();
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("hi!");
        int int2 = strItor1.nextIndex();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationItor9);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(wildcardItorCollectionItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.MapIterator) charSequenceArrayItor0);
        org.junit.Assert.assertNotNull(charSequenceArrayItor0);
        org.junit.Assert.assertNotNull(mapIteratorItor1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}


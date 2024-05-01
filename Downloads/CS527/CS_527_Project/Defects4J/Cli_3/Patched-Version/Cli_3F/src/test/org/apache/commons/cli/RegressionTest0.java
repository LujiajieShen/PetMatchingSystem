package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Class class1 = org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", class1);
        org.junit.Assert.assertNotNull(class1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("hi!");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.TypeHandler typeHandler0 = new org.apache.commons.cli.TypeHandler();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("hi!");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("arg");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("[ option:   ::  ]");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("[ option:   ::  ]", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Class class2 = org.apache.commons.cli.PatternOptionBuilder.URL_VALUE;
        java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("arg", class2);
        java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("[ option:   ::  ]", class2);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("");
        org.junit.Assert.assertNull(fileArray1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.CommandLine commandLine1 = new org.apache.commons.cli.CommandLine();
        java.util.List list2 = commandLine1.getArgList();
        java.lang.String str5 = commandLine1.getOptionValue("hi!", "");
        java.lang.String str7 = commandLine1.getOptionValue('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.UnrecognizedOptionException: hi!", (java.lang.Object) commandLine1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.CommandLine cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("arg");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("arg");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.cli.CommandLine commandLine1 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine1.getOptionValue("hi!");
        java.lang.String str5 = commandLine1.getOptionValue("");
        java.util.List list6 = commandLine1.getArgList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.MissingArgumentException: ", (java.lang.Object) commandLine1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.CommandLine cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "[ Options: [ short {} ] [ long {} ]");
    }
}


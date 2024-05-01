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
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = posixParser0.parse(options1, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.lang.Class<?> wildcardClass11 = commandLine10.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String str13 = commandLine10.getOptionValue("arg");
        boolean boolean15 = commandLine10.hasOption(" ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        org.apache.commons.cli.CommandLine commandLine11 = posixParser1.parse(options2, strArray9, properties10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray12, properties13);
        boolean boolean16 = commandLine14.hasOption('a');
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser56.parse(options57, strArray64, properties65);
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str70 = option69.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup71 = options67.getOptionGroup(option69);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser56.parse(options67, strArray78, properties79, false);
        org.apache.commons.cli.CommandLine commandLine82 = posixParser28.parse(options54, strArray78);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options26, strArray78, false);
        java.lang.Object obj86 = commandLine84.getOptionObject(" ");
        java.lang.String[] strArray88 = commandLine84.getOptionValues("arg");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "arg" + "'", str70, "arg");
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(strArray88);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.util.Iterator iterator12 = commandLine10.iterator();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.lang.String str13 = commandLine10.getOptionValue("arg", "hi!");
        java.lang.String[] strArray15 = commandLine10.getOptionValues("org.apache.commons.cli.MissingArgumentException: arg");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str26 = option25.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup27 = options23.getOptionGroup(option25);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser12.parse(options23, strArray34, properties35, false);
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser38.parse(options39, strArray46, properties47);
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option51 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str52 = option51.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup53 = options49.getOptionGroup(option51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser38.parse(options49, strArray60, properties61, false);
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties73 = null;
        org.apache.commons.cli.CommandLine commandLine74 = posixParser64.parse(options65, strArray72, properties73);
        java.lang.String[] strArray76 = posixParser12.flatten(options49, strArray72, true);
        java.util.Properties properties77 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options11, strArray72, properties77, false);
        org.apache.commons.cli.PosixParser posixParser80 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser81 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options82 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray89 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties90 = null;
        org.apache.commons.cli.CommandLine commandLine91 = posixParser81.parse(options82, strArray89, properties90);
        java.lang.String[] strArray92 = new java.lang.String[] {};
        java.util.Properties properties93 = null;
        org.apache.commons.cli.CommandLine commandLine94 = posixParser80.parse(options82, strArray92, properties93);
        java.lang.String[] strArray95 = null;
        java.util.Properties properties96 = null;
        org.apache.commons.cli.CommandLine commandLine98 = posixParser0.parse(options82, strArray95, properties96, false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "arg" + "'", str52, "arg");
        org.junit.Assert.assertNull(optionGroup53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(commandLine94);
        org.junit.Assert.assertNotNull(commandLine98);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options26, strArray50);
        java.lang.String[] strArray55 = commandLine54.getArgs();
        java.util.List list56 = commandLine54.getArgList();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String str13 = commandLine10.getOptionValue("arg");
        java.lang.Object obj15 = commandLine10.getOptionObject('#');
        java.lang.String[] strArray17 = commandLine10.getOptionValues("org.apache.commons.cli.MissingArgumentException: arg");
        org.apache.commons.cli.Option[] optionArray18 = commandLine10.getOptions();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(optionArray18);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        org.apache.commons.cli.CommandLine commandLine11 = posixParser1.parse(options2, strArray9, properties10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray12, properties13);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser16.parse(options17, strArray24, properties25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = posixParser15.parse(options17, strArray27, properties28);
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser31.parse(options32, strArray39, properties40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Properties properties43 = null;
        org.apache.commons.cli.CommandLine commandLine44 = posixParser30.parse(options32, strArray42, properties43);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser0.parse(options17, strArray42);
        java.util.Iterator iterator46 = commandLine45.iterator();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(iterator46);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String str13 = commandLine10.getOptionValue("arg");
        java.lang.Object obj15 = commandLine10.getOptionObject('#');
        java.lang.String[] strArray17 = commandLine10.getOptionValues("org.apache.commons.cli.MissingArgumentException: arg");
        java.lang.Object obj19 = commandLine10.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options26, strArray50);
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option57 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str58 = option57.getArgName();
        option57.setLongOpt("");
        org.apache.commons.cli.Options options61 = options55.addOption(option57);
        java.util.ListIterator listIterator62 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option57, listIterator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNotNull(option57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "arg" + "'", str58, "arg");
        org.junit.Assert.assertNotNull(options61);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String[] strArray13 = commandLine10.getOptionValues("hi!");
        java.lang.String str15 = commandLine10.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine10.getOptions();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option28 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str29 = option28.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup30 = options26.getOptionGroup(option28);
        org.apache.commons.cli.Option option32 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str33 = option32.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup34 = options26.getOptionGroup(option32);
        org.apache.commons.cli.Option option36 = options26.getOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.PosixParser posixParser37 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser38.parse(options39, strArray46, properties47);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = posixParser37.parse(options39, strArray49, properties50);
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser53.parse(options54, strArray61, properties62);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser52.parse(options54, strArray64, properties65);
        org.apache.commons.cli.PosixParser posixParser67 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options69 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties77 = null;
        org.apache.commons.cli.CommandLine commandLine78 = posixParser68.parse(options69, strArray76, properties77);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Properties properties80 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser67.parse(options69, strArray79, properties80);
        org.apache.commons.cli.CommandLine commandLine82 = posixParser37.parse(options54, strArray79);
        org.apache.commons.cli.Options options83 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option85 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str86 = option85.getArgName();
        option85.setLongOpt("");
        org.apache.commons.cli.Options options89 = options83.addOption(option85);
        java.lang.String[] strArray91 = new java.lang.String[] { " " };
        org.apache.commons.cli.CommandLine commandLine93 = posixParser37.parse(options83, strArray91, true);
        java.lang.String[] strArray95 = posixParser0.flatten(options26, strArray91, true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(option28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNull(optionGroup30);
        org.junit.Assert.assertNotNull(option32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertNull(optionGroup34);
        org.junit.Assert.assertNull(option36);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(option85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "arg" + "'", str86, "arg");
        org.junit.Assert.assertNotNull(options89);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(commandLine93);
        org.junit.Assert.assertNotNull(strArray95);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser11.parse(options13, strArray23, properties24);
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser27.parse(options28, strArray35, properties36);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser26.parse(options28, strArray38, properties39);
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser42.parse(options43, strArray50, properties51);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Properties properties54 = null;
        org.apache.commons.cli.CommandLine commandLine55 = posixParser41.parse(options43, strArray53, properties54);
        org.apache.commons.cli.CommandLine commandLine56 = posixParser11.parse(options28, strArray53);
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str60 = option59.getArgName();
        option59.setLongOpt("");
        org.apache.commons.cli.Options options63 = options57.addOption(option59);
        java.lang.String[] strArray65 = new java.lang.String[] { " " };
        org.apache.commons.cli.CommandLine commandLine67 = posixParser11.parse(options57, strArray65, true);
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties78 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser69.parse(options70, strArray77, properties78);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Properties properties81 = null;
        org.apache.commons.cli.CommandLine commandLine82 = posixParser68.parse(options70, strArray80, properties81);
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options57, strArray80, properties83);
        org.apache.commons.cli.Options options85 = new org.apache.commons.cli.Options();
        java.util.List list86 = options85.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser87 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options88 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray95 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties96 = null;
        org.apache.commons.cli.CommandLine commandLine97 = posixParser87.parse(options88, strArray95, properties96);
        java.lang.String[] strArray99 = posixParser0.flatten(options85, strArray95, false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "arg" + "'", str60, "arg");
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(commandLine97);
        org.junit.Assert.assertNotNull(strArray99);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser11.parse(options12, strArray19, properties20);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str25 = option24.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup26 = options22.getOptionGroup(option24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine36 = posixParser11.parse(options22, strArray33, properties34, false);
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        java.util.List list38 = options37.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser39.parse(options40, strArray47, properties48);
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str53 = option52.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup54 = options50.getOptionGroup(option52);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser39.parse(options50, strArray61, properties62, false);
        org.apache.commons.cli.CommandLine commandLine65 = posixParser11.parse(options37, strArray61);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray69 = posixParser0.flatten(options37, strArray67, true);
        boolean boolean71 = options37.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.OptionGroup optionGroup72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options73 = options37.addOptionGroup(optionGroup72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str26 = option25.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup27 = options23.getOptionGroup(option25);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser12.parse(options23, strArray34, properties35, false);
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser38.parse(options39, strArray46, properties47);
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option51 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str52 = option51.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup53 = options49.getOptionGroup(option51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser38.parse(options49, strArray60, properties61, false);
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties73 = null;
        org.apache.commons.cli.CommandLine commandLine74 = posixParser64.parse(options65, strArray72, properties73);
        java.lang.String[] strArray76 = posixParser12.flatten(options49, strArray72, true);
        java.util.Properties properties77 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options11, strArray72, properties77, false);
        org.apache.commons.cli.Options options84 = options11.addOption(" ", "arg", false, "arg");
        org.apache.commons.cli.Option option85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options86 = options84.addOption(option85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "arg" + "'", str52, "arg");
        org.junit.Assert.assertNull(optionGroup53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(options84);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String str14 = commandLine10.getOptionValue('4', "org.apache.commons.cli.MissingArgumentException: arg");
        java.lang.String str17 = commandLine10.getOptionValue('\000', "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.MissingArgumentException: arg" + "'", str14, "org.apache.commons.cli.MissingArgumentException: arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str26 = option25.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup27 = options23.getOptionGroup(option25);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser12.parse(options23, strArray34, properties35, false);
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser38.parse(options39, strArray46, properties47);
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option51 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str52 = option51.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup53 = options49.getOptionGroup(option51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser38.parse(options49, strArray60, properties61, false);
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties73 = null;
        org.apache.commons.cli.CommandLine commandLine74 = posixParser64.parse(options65, strArray72, properties73);
        java.lang.String[] strArray76 = posixParser12.flatten(options49, strArray72, true);
        java.util.Properties properties77 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options11, strArray72, properties77, false);
        org.apache.commons.cli.Option option81 = org.apache.commons.cli.OptionBuilder.create(' ');
        char char82 = option81.getValueSeparator();
        java.lang.String str83 = option81.getKey();
        option81.setRequired(false);
        org.apache.commons.cli.Options options86 = options11.addOption(option81);
        boolean boolean88 = options11.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "arg" + "'", str52, "arg");
        org.junit.Assert.assertNull(optionGroup53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(option81);
        org.junit.Assert.assertTrue("'" + char82 + "' != '" + '\000' + "'", char82 == '\000');
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + " " + "'", str83, " ");
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        org.apache.commons.cli.CommandLine commandLine11 = posixParser1.parse(options2, strArray9, properties10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray12, properties13);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser16.parse(options17, strArray24, properties25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = posixParser15.parse(options17, strArray27, properties28);
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser31.parse(options32, strArray39, properties40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Properties properties43 = null;
        org.apache.commons.cli.CommandLine commandLine44 = posixParser30.parse(options32, strArray42, properties43);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser0.parse(options17, strArray42);
        java.util.Collection collection46 = options17.getOptionGroups();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String str14 = commandLine10.getOptionValue('4', "org.apache.commons.cli.MissingArgumentException: arg");
        java.util.List list15 = commandLine10.getArgList();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.MissingArgumentException: arg" + "'", str14, "org.apache.commons.cli.MissingArgumentException: arg");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str26 = option25.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup27 = options23.getOptionGroup(option25);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser12.parse(options23, strArray34, properties35, false);
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser38.parse(options39, strArray46, properties47);
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option51 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str52 = option51.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup53 = options49.getOptionGroup(option51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser38.parse(options49, strArray60, properties61, false);
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties73 = null;
        org.apache.commons.cli.CommandLine commandLine74 = posixParser64.parse(options65, strArray72, properties73);
        java.lang.String[] strArray76 = posixParser12.flatten(options49, strArray72, true);
        java.util.Properties properties77 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options11, strArray72, properties77, false);
        org.apache.commons.cli.Option option81 = org.apache.commons.cli.OptionBuilder.create(' ');
        char char82 = option81.getValueSeparator();
        java.lang.String str83 = option81.getKey();
        option81.setRequired(false);
        org.apache.commons.cli.Options options86 = options11.addOption(option81);
        org.apache.commons.cli.Options options87 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option89 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str90 = option89.getArgName();
        option89.setLongOpt("");
        org.apache.commons.cli.Options options93 = options87.addOption(option89);
        option81.setType((java.lang.Object) option89);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "arg" + "'", str52, "arg");
        org.junit.Assert.assertNull(optionGroup53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(option81);
        org.junit.Assert.assertTrue("'" + char82 + "' != '" + '\000' + "'", char82 == '\000');
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + " " + "'", str83, " ");
        org.junit.Assert.assertNotNull(options86);
        org.junit.Assert.assertNotNull(option89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "arg" + "'", str90, "arg");
        org.junit.Assert.assertNotNull(options93);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.CommandLine commandLine54 = posixParser0.parse(options26, strArray50);
        java.lang.String str57 = commandLine54.getOptionValue('#', "arg");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "arg" + "'", str57, "arg");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser56.parse(options57, strArray64, properties65);
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str70 = option69.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup71 = options67.getOptionGroup(option69);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser56.parse(options67, strArray78, properties79, false);
        org.apache.commons.cli.CommandLine commandLine82 = posixParser28.parse(options54, strArray78);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options26, strArray78, false);
        java.lang.String str86 = commandLine84.getOptionValue("arg");
        java.lang.String str88 = commandLine84.getOptionValue('4');
        java.util.List list89 = commandLine84.getArgList();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "arg" + "'", str70, "arg");
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        org.apache.commons.cli.CommandLine commandLine11 = posixParser1.parse(options2, strArray9, properties10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray12, properties13);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser16.parse(options17, strArray24, properties25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = posixParser15.parse(options17, strArray27, properties28);
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser31.parse(options32, strArray39, properties40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Properties properties43 = null;
        org.apache.commons.cli.CommandLine commandLine44 = posixParser30.parse(options32, strArray42, properties43);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser0.parse(options17, strArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options50 = options17.addOption("[ Options: [ short {} ] [ long {} ]", "", false, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine45);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String str13 = commandLine10.getOptionValue("arg");
        java.lang.Object obj15 = commandLine10.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray16 = commandLine10.getOptions();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option25 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str26 = option25.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup27 = options23.getOptionGroup(option25);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser12.parse(options23, strArray34, properties35, false);
        org.apache.commons.cli.PosixParser posixParser38 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser38.parse(options39, strArray46, properties47);
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option51 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str52 = option51.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup53 = options49.getOptionGroup(option51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser38.parse(options49, strArray60, properties61, false);
        org.apache.commons.cli.PosixParser posixParser64 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options65 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties73 = null;
        org.apache.commons.cli.CommandLine commandLine74 = posixParser64.parse(options65, strArray72, properties73);
        java.lang.String[] strArray76 = posixParser12.flatten(options49, strArray72, true);
        java.util.Properties properties77 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser0.parse(options11, strArray72, properties77, false);
        java.lang.String[] strArray81 = commandLine79.getOptionValues("org.apache.commons.cli.MissingArgumentException: arg");
        org.apache.commons.cli.Option option83 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str84 = option83.getArgName();
        option83.setLongOpt("");
        boolean boolean87 = option83.hasArgs();
        java.lang.String str88 = option83.getKey();
        commandLine79.addOption(option83);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(option25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertNull(optionGroup27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(option51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "arg" + "'", str52, "arg");
        org.junit.Assert.assertNull(optionGroup53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(commandLine74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNull(strArray81);
        org.junit.Assert.assertNotNull(option83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "arg" + "'", str84, "arg");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser56.parse(options57, strArray64, properties65);
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str70 = option69.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup71 = options67.getOptionGroup(option69);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser56.parse(options67, strArray78, properties79, false);
        org.apache.commons.cli.CommandLine commandLine82 = posixParser28.parse(options54, strArray78);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options26, strArray78, false);
        org.apache.commons.cli.Option option86 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str87 = option86.getArgName();
        option86.setLongOpt("");
        boolean boolean90 = option86.hasArgs();
        java.util.ListIterator listIterator91 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option86, listIterator91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "arg" + "'", str70, "arg");
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNotNull(option86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "arg" + "'", str87, "arg");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        posixParser0.burstToken("arg", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = posixParser12.parse(options13, strArray20, properties21);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Properties properties24 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser11.parse(options13, strArray23, properties24);
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser27 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options28 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser27.parse(options28, strArray35, properties36);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Properties properties39 = null;
        org.apache.commons.cli.CommandLine commandLine40 = posixParser26.parse(options28, strArray38, properties39);
        org.apache.commons.cli.PosixParser posixParser41 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser42.parse(options43, strArray50, properties51);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Properties properties54 = null;
        org.apache.commons.cli.CommandLine commandLine55 = posixParser41.parse(options43, strArray53, properties54);
        org.apache.commons.cli.CommandLine commandLine56 = posixParser11.parse(options28, strArray53);
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option59 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str60 = option59.getArgName();
        option59.setLongOpt("");
        org.apache.commons.cli.Options options63 = options57.addOption(option59);
        java.lang.String[] strArray65 = new java.lang.String[] { " " };
        org.apache.commons.cli.CommandLine commandLine67 = posixParser11.parse(options57, strArray65, true);
        org.apache.commons.cli.PosixParser posixParser68 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser69 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options70 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties78 = null;
        org.apache.commons.cli.CommandLine commandLine79 = posixParser69.parse(options70, strArray77, properties78);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Properties properties81 = null;
        org.apache.commons.cli.CommandLine commandLine82 = posixParser68.parse(options70, strArray80, properties81);
        java.util.Properties properties83 = null;
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options57, strArray80, properties83);
        java.lang.Object obj86 = commandLine84.getOptionObject(" ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(commandLine40);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(option59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "arg" + "'", str60, "arg");
        org.junit.Assert.assertNotNull(options63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(commandLine79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.lang.String str13 = commandLine10.getOptionValue("[ Options: [ short {} ] [ long {} ]", " ");
        java.lang.Class<?> wildcardClass14 = commandLine10.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.lang.String str13 = commandLine10.getOptionValue("[ Options: [ short {} ] [ long {} ]", " ");
        java.lang.Object obj15 = commandLine10.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser11.parse(options12, strArray19, properties20);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str25 = option24.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup26 = options22.getOptionGroup(option24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine36 = posixParser11.parse(options22, strArray33, properties34, false);
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        java.util.List list38 = options37.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser39.parse(options40, strArray47, properties48);
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str53 = option52.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup54 = options50.getOptionGroup(option52);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser39.parse(options50, strArray61, properties62, false);
        org.apache.commons.cli.CommandLine commandLine65 = posixParser11.parse(options37, strArray61);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray69 = posixParser0.flatten(options37, strArray67, true);
        boolean boolean71 = options37.hasOption("[ Options: [ short {} ] [ long {} ]");
        boolean boolean73 = options37.hasOption("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        org.apache.commons.cli.Option[] optionArray12 = commandLine10.getOptions();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(optionArray12);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        java.util.List list11 = commandLine10.getArgList();
        java.lang.String[] strArray13 = commandLine10.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine10.getOptionObject('4');
        java.lang.String str17 = commandLine10.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        org.apache.commons.cli.CommandLine commandLine11 = posixParser1.parse(options2, strArray9, properties10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray12, properties13);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser16.parse(options17, strArray24, properties25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = posixParser15.parse(options17, strArray27, properties28);
        org.apache.commons.cli.PosixParser posixParser30 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser31 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options32 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser31.parse(options32, strArray39, properties40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Properties properties43 = null;
        org.apache.commons.cli.CommandLine commandLine44 = posixParser30.parse(options32, strArray42, properties43);
        org.apache.commons.cli.CommandLine commandLine45 = posixParser0.parse(options17, strArray42);
        org.apache.commons.cli.Options options46 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option48 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str49 = option48.getArgName();
        option48.setLongOpt("");
        org.apache.commons.cli.Options options52 = options46.addOption(option48);
        java.lang.String[] strArray54 = new java.lang.String[] { " " };
        org.apache.commons.cli.CommandLine commandLine56 = posixParser0.parse(options46, strArray54, true);
        org.apache.commons.cli.Option option58 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str59 = option58.getArgName();
        option58.setLongOpt("");
        boolean boolean62 = option58.hasArg();
        char char63 = option58.getValueSeparator();
        char char64 = option58.getValueSeparator();
        commandLine56.addOption(option58);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(commandLine45);
        org.junit.Assert.assertNotNull(option48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "arg" + "'", str49, "arg");
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(commandLine56);
        org.junit.Assert.assertNotNull(option58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\000' + "'", char63 == '\000');
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\000' + "'", char64 == '\000');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser56.parse(options57, strArray64, properties65);
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str70 = option69.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup71 = options67.getOptionGroup(option69);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser56.parse(options67, strArray78, properties79, false);
        org.apache.commons.cli.CommandLine commandLine82 = posixParser28.parse(options54, strArray78);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options26, strArray78, false);
        java.lang.Object obj86 = commandLine84.getOptionObject(" ");
        java.util.Iterator iterator87 = commandLine84.iterator();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "arg" + "'", str70, "arg");
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(iterator87);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option13 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str14 = option13.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup15 = options11.getOptionGroup(option13);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine25 = posixParser0.parse(options11, strArray22, properties23, false);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.util.List list27 = options26.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options29 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties37 = null;
        org.apache.commons.cli.CommandLine commandLine38 = posixParser28.parse(options29, strArray36, properties37);
        org.apache.commons.cli.Options options39 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option41 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str42 = option41.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup43 = options39.getOptionGroup(option41);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine53 = posixParser28.parse(options39, strArray50, properties51, false);
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.util.List list55 = options54.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine66 = posixParser56.parse(options57, strArray64, properties65);
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option69 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str70 = option69.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup71 = options67.getOptionGroup(option69);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties79 = null;
        org.apache.commons.cli.CommandLine commandLine81 = posixParser56.parse(options67, strArray78, properties79, false);
        org.apache.commons.cli.CommandLine commandLine82 = posixParser28.parse(options54, strArray78);
        org.apache.commons.cli.CommandLine commandLine84 = posixParser0.parse(options26, strArray78, false);
        java.lang.String str86 = commandLine84.getOptionValue("arg");
        java.lang.String[] strArray87 = commandLine84.getArgs();
        java.lang.String str89 = commandLine84.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(option13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNull(optionGroup15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(commandLine38);
        org.junit.Assert.assertNotNull(option41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertNull(optionGroup43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine53);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine66);
        org.junit.Assert.assertNotNull(option69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "arg" + "'", str70, "arg");
        org.junit.Assert.assertNull(optionGroup71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(commandLine81);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(commandLine84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        org.apache.commons.cli.CommandLine commandLine11 = posixParser1.parse(options2, strArray9, properties10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray12, properties13);
        org.apache.commons.cli.Options options19 = options2.addOption("", "[ option:   :: null :: 0 ]", true, " ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(commandLine11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(options19);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties20 = null;
        org.apache.commons.cli.CommandLine commandLine21 = posixParser11.parse(options12, strArray19, properties20);
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str25 = option24.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup26 = options22.getOptionGroup(option24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine36 = posixParser11.parse(options22, strArray33, properties34, false);
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        java.util.List list38 = options37.getRequiredOptions();
        org.apache.commons.cli.PosixParser posixParser39 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options40 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "arg", "arg", "hi!", "hi!" };
        java.util.Properties properties48 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser39.parse(options40, strArray47, properties48);
        org.apache.commons.cli.Options options50 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option52 = org.apache.commons.cli.OptionBuilder.create("");
        java.lang.String str53 = option52.getArgName();
        org.apache.commons.cli.OptionGroup optionGroup54 = options50.getOptionGroup(option52);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", " ", "", "hi!", "", "arg" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser39.parse(options50, strArray61, properties62, false);
        org.apache.commons.cli.CommandLine commandLine65 = posixParser11.parse(options37, strArray61);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray69 = posixParser0.flatten(options37, strArray67, true);
        boolean boolean71 = options37.hasOption("[ Options: [ short {} ] [ long {} ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options76 = options37.addOption("hi!", " ", false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '!'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(commandLine21);
        org.junit.Assert.assertNotNull(option24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertNull(optionGroup26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(option52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertNull(optionGroup54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(commandLine65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }
}

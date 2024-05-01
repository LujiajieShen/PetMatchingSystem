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
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Class<?> wildcardClass15 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String str13 = commandLine8.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = org.apache.commons.cli.OptionBuilder.create("");
        option16.setLongOpt("hi!");
        java.lang.String str19 = option16.getOpt();
        java.util.ListIterator listIterator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option16, listIterator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(option16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        boolean boolean18 = commandLine14.hasOption("[ option:   +ARG ::  ]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.Class<?> wildcardClass11 = commandLine8.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser10.parse(options11, strArray16, properties17);
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser29.parse(options30, strArray35, properties36);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine44 = posixParser28.parse(options30, strArray43);
        java.lang.String[] strArray46 = posixParser10.flatten(options20, strArray43, true);
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options2, strArray43, properties47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options53 = options2.addOption("[ option:   +ARG ::  ]", "", true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '['");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.OptionGroup optionGroup17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options18 = options2.addOptionGroup(optionGroup17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.lang.String str19 = commandLine14.getOptionValue(' ');
        java.lang.String str22 = commandLine14.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        java.util.List list23 = commandLine14.getArgList();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str22, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String str12 = commandLine8.getOptionValue("[ Options: [ short {} ] [ long {} ]");
        java.lang.Object obj14 = commandLine8.getOptionObject("org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options21 = options15.addOption(option20);
        org.apache.commons.cli.Option option23 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.Options options24 = options15.addOption(option23);
        java.util.ListIterator listIterator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option23, listIterator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(option23);
        org.junit.Assert.assertNotNull(options24);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser18.parse(options19, strArray24, properties25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser17.parse(options19, strArray28, properties29, true);
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine48 = posixParser32.parse(options34, strArray47);
        org.apache.commons.cli.CommandLine commandLine49 = posixParser0.parse(options19, strArray47);
        posixParser0.burstToken("hi!", true);
        java.lang.Class<?> wildcardClass53 = posixParser0.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options10 = options4.addOption(option9);
        boolean boolean11 = option9.hasArgName();
        commandLine0.addOption(option9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser18.parse(options19, strArray24, properties25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser17.parse(options19, strArray28, properties29, true);
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine48 = posixParser32.parse(options34, strArray47);
        org.apache.commons.cli.Options options49 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option54 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options55 = options49.addOption(option54);
        org.apache.commons.cli.PosixParser posixParser56 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options57 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = posixParser56.parse(options57, strArray62, properties63);
        org.apache.commons.cli.PosixParser posixParser65 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options66 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties72 = null;
        org.apache.commons.cli.CommandLine commandLine73 = posixParser65.parse(options66, strArray71, properties72);
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties82 = null;
        org.apache.commons.cli.CommandLine commandLine83 = posixParser75.parse(options76, strArray81, properties82);
        java.lang.String[] strArray89 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine90 = posixParser74.parse(options76, strArray89);
        java.lang.String[] strArray92 = posixParser56.flatten(options66, strArray89, true);
        java.util.Properties properties93 = null;
        org.apache.commons.cli.CommandLine commandLine95 = posixParser32.parse(options49, strArray92, properties93, false);
        java.util.Properties properties96 = null;
        org.apache.commons.cli.CommandLine commandLine97 = posixParser0.parse(options19, strArray92, properties96);
        boolean boolean99 = commandLine97.hasOption("[ option:   +ARG ::  ]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(options55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(commandLine73);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(commandLine90);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(commandLine95);
        org.junit.Assert.assertNotNull(commandLine97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        option1.setOptionalArg(false);
        boolean boolean4 = option1.hasLongOpt();
        org.apache.commons.cli.CommandLine commandLine5 = new org.apache.commons.cli.CommandLine();
        java.lang.String str7 = commandLine5.getOptionValue('#');
        option1.setType((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.lang.String str19 = commandLine14.getOptionValue(' ');
        boolean boolean21 = commandLine14.hasOption('4');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String str12 = commandLine8.getOptionValue("[ Options: [ short {} ] [ long {} ]");
        java.lang.String str15 = commandLine8.getOptionValue(' ', "[ option:   +ARG ::  ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ option:   +ARG ::  ]" + "'", str15, "[ option:   +ARG ::  ]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options23 = options17.addOption(option22);
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser24.parse(options25, strArray30, properties31);
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = posixParser43.parse(options44, strArray49, properties50);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine58 = posixParser42.parse(options44, strArray57);
        java.lang.String[] strArray60 = posixParser24.flatten(options34, strArray57, true);
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser0.parse(options17, strArray60, properties61, false);
        posixParser0.burstToken("hi!", false);
        org.apache.commons.cli.Options options67 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option72 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options73 = options67.addOption(option72);
        java.lang.String[] strArray80 = new java.lang.String[] { "org.apache.commons.cli.MissingArgumentException: hi!", "org.apache.commons.cli.ParseException: ", "hi!", "", "org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: ", "[ Options: [ short {} ] [ long {} ]" };
        java.util.Properties properties81 = null;
        org.apache.commons.cli.CommandLine commandLine82 = posixParser0.parse(options73, strArray80, properties81);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(options73);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(commandLine82);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        java.util.List list17 = commandLine16.getArgList();
        java.lang.String[] strArray18 = commandLine16.getArgs();
        java.lang.Object obj20 = commandLine16.getOptionObject('4');
        java.lang.String str23 = commandLine16.getOptionValue("org.apache.commons.cli.MissingArgumentException: hi!", "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String str12 = commandLine8.getOptionValue("[ Options: [ short {} ] [ long {} ]");
        commandLine8.addArg("[ option:   +ARG ::  ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = options2.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.Option option18 = org.apache.commons.cli.OptionBuilder.create('a');
        option18.setDescription("");
        org.apache.commons.cli.OptionGroup optionGroup21 = options2.getOptionGroup(option18);
        java.util.List list22 = options2.getRequiredOptions();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNull(optionGroup21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.List list1 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = options2.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.OptionBuilder optionBuilder17 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) options2);
        java.util.Collection collection18 = options2.getOptionGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options23 = options2.addOption("org.apache.commons.cli.ParseException: ", "", true, "org.apache.commons.cli.MissingArgumentException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(optionBuilder17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser10.parse(options11, strArray16, properties17);
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser29.parse(options30, strArray35, properties36);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine44 = posixParser28.parse(options30, strArray43);
        java.lang.String[] strArray46 = posixParser10.flatten(options20, strArray43, true);
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options2, strArray43, properties47);
        java.lang.String str50 = commandLine48.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        java.util.List list17 = commandLine16.getArgList();
        java.lang.String str19 = commandLine16.getOptionValue('a');
        java.lang.String[] strArray21 = commandLine16.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser10.parse(options11, strArray16, properties17);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine25 = posixParser9.parse(options11, strArray24);
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options32 = options26.addOption(option31);
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties49 = null;
        org.apache.commons.cli.CommandLine commandLine50 = posixParser42.parse(options43, strArray48, properties49);
        org.apache.commons.cli.PosixParser posixParser51 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser52 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties59 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser52.parse(options53, strArray58, properties59);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine67 = posixParser51.parse(options53, strArray66);
        java.lang.String[] strArray69 = posixParser33.flatten(options43, strArray66, true);
        java.util.Properties properties70 = null;
        org.apache.commons.cli.CommandLine commandLine72 = posixParser9.parse(options26, strArray69, properties70, false);
        org.apache.commons.cli.PosixParser posixParser73 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser74 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options75 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties81 = null;
        org.apache.commons.cli.CommandLine commandLine82 = posixParser74.parse(options75, strArray80, properties81);
        java.lang.String[] strArray88 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine89 = posixParser73.parse(options75, strArray88);
        java.lang.String[] strArray91 = posixParser0.flatten(options26, strArray88, false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(commandLine50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(commandLine72);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(commandLine82);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(commandLine89);
        org.junit.Assert.assertNotNull(strArray91);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        java.lang.String[] strArray17 = commandLine14.getArgs();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create("");
        option19.setLongOpt("hi!");
        option19.setOptionalArg(true);
        commandLine14.addOption(option19);
        java.util.Iterator iterator25 = commandLine14.iterator();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        java.util.List list17 = commandLine16.getArgList();
        java.lang.String str19 = commandLine16.getOptionValue('a');
        java.util.Iterator iterator20 = commandLine16.iterator();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser18.parse(options19, strArray24, properties25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser17.parse(options19, strArray28, properties29, true);
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine48 = posixParser32.parse(options34, strArray47);
        org.apache.commons.cli.CommandLine commandLine49 = posixParser0.parse(options19, strArray47);
        posixParser0.burstToken("hi!", true);
        org.apache.commons.cli.PosixParser posixParser53 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine62 = posixParser54.parse(options55, strArray60, properties61);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.Properties properties65 = null;
        org.apache.commons.cli.CommandLine commandLine67 = posixParser53.parse(options55, strArray64, properties65, true);
        org.apache.commons.cli.Option option69 = options55.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.Option option71 = org.apache.commons.cli.OptionBuilder.create('a');
        option71.setDescription("");
        org.apache.commons.cli.OptionGroup optionGroup74 = options55.getOptionGroup(option71);
        org.apache.commons.cli.PosixParser posixParser75 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options76 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties82 = null;
        org.apache.commons.cli.CommandLine commandLine83 = posixParser75.parse(options76, strArray81, properties82);
        java.lang.String[] strArray85 = posixParser0.flatten(options55, strArray81, true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(commandLine67);
        org.junit.Assert.assertNull(option69);
        org.junit.Assert.assertNotNull(option71);
        org.junit.Assert.assertNull(optionGroup74);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(commandLine83);
        org.junit.Assert.assertNotNull(strArray85);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.lang.String str19 = commandLine14.getOptionValue(' ');
        java.lang.String str22 = commandLine14.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        java.util.Iterator iterator23 = commandLine14.iterator();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str22, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String[] strArray12 = commandLine8.getOptionValues("org.apache.commons.cli.ParseException: ");
        boolean boolean14 = commandLine8.hasOption("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str20 = option19.toString();
        boolean boolean22 = option19.equals((java.lang.Object) 100L);
        char char23 = option19.getValueSeparator();
        commandLine8.addOption(option19);
        java.lang.String str27 = commandLine8.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:   +ARG ::  ]" + "'", str20, "[ option:   +ARG ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = posixParser9.parse(options10, strArray15, properties16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine34 = posixParser18.parse(options20, strArray33);
        java.lang.String[] strArray36 = posixParser0.flatten(options10, strArray33, true);
        java.util.List list37 = options10.getRequiredOptions();
        java.util.Collection collection38 = options10.getOptions();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create("");
        option40.setLongOpt("hi!");
        int int43 = option40.getArgs();
        java.lang.String str44 = option40.getLongOpt();
        org.apache.commons.cli.Options options45 = options10.addOption(option40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options49 = options45.addOption("org.apache.commons.cli.ParseException: ", true, "[ Options: [ short {} ] [ long {} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: opt contains illegal character value '.'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(option40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(options45);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str23 = option21.getValue("");
        option21.setValueSeparator('4');
        java.util.ListIterator listIterator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            posixParser0.processArgs(option21, listIterator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue('4', "a");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.lang.String[] strArray19 = commandLine14.getOptionValues("[ option:   +ARG ::  ]");
        boolean boolean21 = commandLine14.hasOption('\000');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String[] strArray12 = commandLine8.getOptionValues("org.apache.commons.cli.ParseException: ");
        boolean boolean14 = commandLine8.hasOption("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String str20 = option19.toString();
        boolean boolean22 = option19.equals((java.lang.Object) 100L);
        char char23 = option19.getValueSeparator();
        commandLine8.addOption(option19);
        java.lang.String str26 = commandLine8.getOptionValue("[ option:   +ARG ::  ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[ option:   +ARG ::  ]" + "'", str20, "[ option:   +ARG ::  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str2 = commandLine0.getOptionValue('#');
        java.lang.String str4 = commandLine0.getOptionValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        java.lang.String[] strArray12 = commandLine8.getOptionValues("org.apache.commons.cli.ParseException: ");
        java.lang.String[] strArray14 = commandLine8.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = posixParser9.parse(options10, strArray15, properties16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine34 = posixParser18.parse(options20, strArray33);
        java.lang.String[] strArray36 = posixParser0.flatten(options10, strArray33, true);
        java.util.Collection collection37 = options10.getOptionGroups();
        boolean boolean39 = options10.hasOption("[ Options: [ short {} ] [ long {} ]");
        java.util.Collection collection40 = options10.getOptions();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        java.lang.Object obj16 = commandLine14.getOptionObject(' ');
        java.lang.String[] strArray17 = commandLine14.getArgs();
        java.lang.String str19 = commandLine14.getOptionValue(' ');
        java.lang.String str22 = commandLine14.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        commandLine14.addArg("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Option[] optionArray25 = commandLine14.getOptions();
        java.lang.Object obj27 = commandLine14.getOptionObject('\000');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str22, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(optionArray25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser18.parse(options19, strArray24, properties25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser17.parse(options19, strArray28, properties29, true);
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine48 = posixParser32.parse(options34, strArray47);
        org.apache.commons.cli.CommandLine commandLine49 = posixParser0.parse(options19, strArray47);
        java.lang.String[] strArray50 = commandLine49.getArgs();
        java.lang.Object obj52 = commandLine49.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = posixParser9.parse(options10, strArray15, properties16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine34 = posixParser18.parse(options20, strArray33);
        java.lang.String[] strArray36 = posixParser0.flatten(options10, strArray33, true);
        boolean boolean38 = options10.hasOption("org.apache.commons.cli.MissingArgumentException: hi!");
        org.apache.commons.cli.Options options42 = options10.addOption("", true, "hi!");
        boolean boolean44 = options10.hasOption("org.apache.commons.cli.MissingArgumentException: hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(options42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str3 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        boolean boolean5 = commandLine0.hasOption('#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options23 = options17.addOption(option22);
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser24.parse(options25, strArray30, properties31);
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = posixParser43.parse(options44, strArray49, properties50);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine58 = posixParser42.parse(options44, strArray57);
        java.lang.String[] strArray60 = posixParser24.flatten(options34, strArray57, true);
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser0.parse(options17, strArray60, properties61, false);
        java.lang.String str65 = commandLine63.getOptionValue("");
        java.util.List list66 = commandLine63.getArgList();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser18.parse(options19, strArray24, properties25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser17.parse(options19, strArray28, properties29, true);
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine48 = posixParser32.parse(options34, strArray47);
        org.apache.commons.cli.CommandLine commandLine49 = posixParser0.parse(options19, strArray47);
        org.apache.commons.cli.Option[] optionArray50 = commandLine49.getOptions();
        java.lang.String str52 = commandLine49.getOptionValue("org.apache.commons.cli.ParseException: ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(optionArray50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine0.getOptionValue("[ option:   +ARG ::  ]", "[ Options: [ short {} ] [ long {} ]");
        java.lang.Object obj5 = commandLine0.getOptionObject('a');
        boolean boolean7 = commandLine0.hasOption("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str3, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser2.parse(options3, strArray8, properties9);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine17 = posixParser1.parse(options3, strArray16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Properties properties30 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser18.parse(options20, strArray29, properties30, true);
        org.apache.commons.cli.CommandLine commandLine33 = posixParser0.parse(options3, strArray29);
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options36 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties42 = null;
        org.apache.commons.cli.CommandLine commandLine43 = posixParser35.parse(options36, strArray41, properties42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.Properties properties46 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser34.parse(options36, strArray45, properties46, true);
        org.apache.commons.cli.Option option50 = options36.getOption("[ option:   +ARG ::  ]");
        java.lang.String str51 = options36.toString();
        java.lang.String[] strArray52 = null;
        java.util.Properties properties53 = null;
        org.apache.commons.cli.CommandLine commandLine55 = posixParser0.parse(options36, strArray52, properties53, true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNull(option50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str51, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(commandLine55);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options21 = options15.addOption(option20);
        org.apache.commons.cli.Options options25 = options15.addOption("a", true, "[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.PosixParser posixParser26 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = posixParser26.parse(options27, strArray32, properties33);
        org.apache.commons.cli.PosixParser posixParser35 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser36 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options37 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties43 = null;
        org.apache.commons.cli.CommandLine commandLine44 = posixParser36.parse(options37, strArray42, properties43);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine49 = posixParser35.parse(options37, strArray46, properties47, true);
        org.apache.commons.cli.Option option51 = options37.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.OptionBuilder optionBuilder52 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) options37);
        java.util.Collection collection53 = options37.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser54 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser55 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options56 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser55.parse(options56, strArray61, properties62);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.Properties properties66 = null;
        org.apache.commons.cli.CommandLine commandLine68 = posixParser54.parse(options56, strArray65, properties66, true);
        java.lang.String[] strArray70 = posixParser26.flatten(options37, strArray65, false);
        java.util.Properties properties71 = null;
        org.apache.commons.cli.CommandLine commandLine72 = posixParser0.parse(options25, strArray65, properties71);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNull(option51);
        org.junit.Assert.assertNotNull(optionBuilder52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(commandLine68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(commandLine72);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        org.apache.commons.cli.PosixParser posixParser10 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = posixParser10.parse(options11, strArray16, properties17);
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        org.apache.commons.cli.PosixParser posixParser28 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser29 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options30 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties36 = null;
        org.apache.commons.cli.CommandLine commandLine37 = posixParser29.parse(options30, strArray35, properties36);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine44 = posixParser28.parse(options30, strArray43);
        java.lang.String[] strArray46 = posixParser10.flatten(options20, strArray43, true);
        java.util.Properties properties47 = null;
        org.apache.commons.cli.CommandLine commandLine48 = posixParser0.parse(options2, strArray43, properties47);
        java.util.Collection collection49 = options2.getOptionGroups();
        java.util.Collection collection50 = options2.getOptions();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(commandLine37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(commandLine44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = options2.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.Option option18 = org.apache.commons.cli.OptionBuilder.create('a');
        option18.setDescription("");
        org.apache.commons.cli.OptionGroup optionGroup21 = options2.getOptionGroup(option18);
        java.lang.String str22 = option18.getKey();
        java.lang.String str23 = option18.getKey();
        option18.setDescription("hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(option18);
        org.junit.Assert.assertNull(optionGroup21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = options2.getOption("[ option:   +ARG ::  ]");
        java.lang.String str17 = options2.toString();
        boolean boolean19 = options2.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str17, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        java.util.List list17 = commandLine16.getArgList();
        java.lang.String[] strArray18 = commandLine16.getArgs();
        java.lang.Object obj20 = commandLine16.getOptionObject('4');
        java.lang.String str22 = commandLine16.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser16 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = posixParser16.parse(options17, strArray22, properties23);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine31 = posixParser15.parse(options17, strArray30);
        java.lang.String[] strArray32 = null;
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = posixParser0.parse(options17, strArray32, properties33);
        commandLine34.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(commandLine34);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.Options options17 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "", false, "[ option:   +ARG ::  ]");
        org.apache.commons.cli.Options options23 = options17.addOption(option22);
        org.apache.commons.cli.PosixParser posixParser24 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser24.parse(options25, strArray30, properties31);
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        org.apache.commons.cli.PosixParser posixParser42 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options44 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties50 = null;
        org.apache.commons.cli.CommandLine commandLine51 = posixParser43.parse(options44, strArray49, properties50);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine58 = posixParser42.parse(options44, strArray57);
        java.lang.String[] strArray60 = posixParser24.flatten(options34, strArray57, true);
        java.util.Properties properties61 = null;
        org.apache.commons.cli.CommandLine commandLine63 = posixParser0.parse(options17, strArray60, properties61, false);
        java.lang.String str65 = commandLine63.getOptionValue("org.apache.commons.cli.ParseException: ");
        java.lang.String str67 = commandLine63.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(options23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(commandLine51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(commandLine58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser2.parse(options3, strArray8, properties9);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine17 = posixParser1.parse(options3, strArray16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Properties properties30 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser18.parse(options20, strArray29, properties30, true);
        org.apache.commons.cli.CommandLine commandLine33 = posixParser0.parse(options3, strArray29);
        org.apache.commons.cli.Option option35 = options3.getOption("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNull(option35);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        boolean boolean10 = commandLine8.hasOption(' ');
        boolean boolean12 = commandLine8.hasOption("[ Options: [ short {} ] [ long {} ]");
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) commandLine8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser2.parse(options3, strArray8, properties9);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine17 = posixParser1.parse(options3, strArray16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Properties properties30 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser18.parse(options20, strArray29, properties30, true);
        org.apache.commons.cli.CommandLine commandLine33 = posixParser0.parse(options3, strArray29);
        commandLine33.addArg("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(commandLine33);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = options2.getOption("[ option:   +ARG ::  ]");
        java.lang.String str17 = options2.toString();
        org.apache.commons.cli.Option option19 = org.apache.commons.cli.OptionBuilder.create('a');
        option19.setDescription("");
        option19.setDescription("[ option:   +ARG ::  ]");
        java.lang.String str24 = option19.getDescription();
        org.apache.commons.cli.Options options25 = options2.addOption(option19);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str17, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(option19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ option:   +ARG ::  ]" + "'", str24, "[ option:   +ARG ::  ]");
        org.junit.Assert.assertNotNull(options25);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine16 = posixParser0.parse(options2, strArray15);
        org.apache.commons.cli.PosixParser posixParser17 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties25 = null;
        org.apache.commons.cli.CommandLine commandLine26 = posixParser18.parse(options19, strArray24, properties25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.Properties properties29 = null;
        org.apache.commons.cli.CommandLine commandLine31 = posixParser17.parse(options19, strArray28, properties29, true);
        org.apache.commons.cli.PosixParser posixParser32 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser33 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser33.parse(options34, strArray39, properties40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine48 = posixParser32.parse(options34, strArray47);
        org.apache.commons.cli.CommandLine commandLine49 = posixParser0.parse(options19, strArray47);
        org.apache.commons.cli.Option[] optionArray50 = commandLine49.getOptions();
        java.lang.Object obj52 = commandLine49.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(commandLine31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(commandLine48);
        org.junit.Assert.assertNotNull(commandLine49);
        org.junit.Assert.assertNotNull(optionArray50);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = posixParser2.parse(options3, strArray8, properties9);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine17 = posixParser1.parse(options3, strArray16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.Properties properties30 = null;
        org.apache.commons.cli.CommandLine commandLine32 = posixParser18.parse(options20, strArray29, properties30, true);
        org.apache.commons.cli.CommandLine commandLine33 = posixParser0.parse(options3, strArray29);
        org.apache.commons.cli.Option option38 = new org.apache.commons.cli.Option("", "", true, "");
        java.lang.String[] strArray39 = option38.getValues();
        commandLine33.addOption(option38);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNull(strArray39);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.Option option16 = options2.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.OptionBuilder optionBuilder17 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) options2);
        org.apache.commons.cli.Option option19 = options2.getOption("a");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNull(option16);
        org.junit.Assert.assertNotNull(optionBuilder17);
        org.junit.Assert.assertNull(option19);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String str2 = commandLine0.getOptionValue('#');
        java.lang.String str4 = commandLine0.getOptionValue("hi!");
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        org.apache.commons.cli.CommandLine commandLine9 = posixParser1.parse(options2, strArray7, properties8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.Properties properties12 = null;
        org.apache.commons.cli.CommandLine commandLine14 = posixParser0.parse(options2, strArray11, properties12, true);
        org.apache.commons.cli.PosixParser posixParser15 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties22 = null;
        org.apache.commons.cli.CommandLine commandLine23 = posixParser15.parse(options16, strArray21, properties22);
        java.lang.String str24 = options16.toString();
        org.apache.commons.cli.PosixParser posixParser25 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties32 = null;
        org.apache.commons.cli.CommandLine commandLine33 = posixParser25.parse(options26, strArray31, properties32);
        org.apache.commons.cli.PosixParser posixParser34 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options35 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties41 = null;
        org.apache.commons.cli.CommandLine commandLine42 = posixParser34.parse(options35, strArray40, properties41);
        org.apache.commons.cli.PosixParser posixParser43 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser44 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties51 = null;
        org.apache.commons.cli.CommandLine commandLine52 = posixParser44.parse(options45, strArray50, properties51);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine59 = posixParser43.parse(options45, strArray58);
        java.lang.String[] strArray61 = posixParser25.flatten(options35, strArray58, true);
        org.apache.commons.cli.CommandLine commandLine63 = posixParser0.parse(options16, strArray61, false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(commandLine9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(commandLine14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str24, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(commandLine42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(commandLine59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        org.apache.commons.cli.CommandLine commandLine8 = posixParser0.parse(options1, strArray6, properties7);
        org.apache.commons.cli.PosixParser posixParser9 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options10 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        org.apache.commons.cli.CommandLine commandLine17 = posixParser9.parse(options10, strArray15, properties16);
        org.apache.commons.cli.PosixParser posixParser18 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser19 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options20 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties26 = null;
        org.apache.commons.cli.CommandLine commandLine27 = posixParser19.parse(options20, strArray25, properties26);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "[ option:   +ARG ::  ]", "[ option:   +ARG ::  ]", "hi!", "" };
        org.apache.commons.cli.CommandLine commandLine34 = posixParser18.parse(options20, strArray33);
        java.lang.String[] strArray36 = posixParser0.flatten(options10, strArray33, true);
        java.util.List list37 = options10.getRequiredOptions();
        java.util.Collection collection38 = options10.getOptions();
        org.apache.commons.cli.Option option40 = org.apache.commons.cli.OptionBuilder.create("");
        option40.setLongOpt("hi!");
        int int43 = option40.getArgs();
        java.lang.String str44 = option40.getLongOpt();
        org.apache.commons.cli.Options options45 = options10.addOption(option40);
        org.apache.commons.cli.PosixParser posixParser46 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser47 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options48 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "[ option:   +ARG ::  ]", "hi!", "hi!" };
        java.util.Properties properties54 = null;
        org.apache.commons.cli.CommandLine commandLine55 = posixParser47.parse(options48, strArray53, properties54);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.Properties properties58 = null;
        org.apache.commons.cli.CommandLine commandLine60 = posixParser46.parse(options48, strArray57, properties58, true);
        org.apache.commons.cli.Option option62 = options48.getOption("[ option:   +ARG ::  ]");
        org.apache.commons.cli.Option option64 = org.apache.commons.cli.OptionBuilder.create('a');
        option64.setDescription("");
        org.apache.commons.cli.OptionGroup optionGroup67 = options48.getOptionGroup(option64);
        java.lang.String str68 = option64.getKey();
        option64.setArgName("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.ParseException: ");
        org.apache.commons.cli.Options options71 = options45.addOption(option64);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(commandLine8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(commandLine17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(commandLine27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(option40);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2) + "'", int43 == (-2));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(options45);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(commandLine55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(commandLine60);
        org.junit.Assert.assertNull(option62);
        org.junit.Assert.assertNotNull(option64);
        org.junit.Assert.assertNull(optionGroup67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "a" + "'", str68, "a");
        org.junit.Assert.assertNotNull(options71);
    }
}

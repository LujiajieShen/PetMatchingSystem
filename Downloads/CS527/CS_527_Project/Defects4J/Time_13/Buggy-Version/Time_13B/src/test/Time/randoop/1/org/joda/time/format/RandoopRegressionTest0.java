package org.joda.time.format;

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
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternate();
        org.junit.Assert.assertNotNull(periodFormatter0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.PeriodType periodType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period((java.lang.Object) "hi!", periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.junit.Assert.assertNotNull(periodFormatter0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder1.appendSeparator("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateWithWeeks();
        org.junit.Assert.assertNotNull(periodFormatter0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatterBuilder1.toFormatter();
        boolean boolean5 = periodFormatter4.isPrinter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtendedWithWeeks();
        org.junit.Assert.assertNotNull(periodFormatter0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis3Digit();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendSecondsWithOptionalMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendYears();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        java.lang.String[] strArray6 = null;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder3.appendSeparator("UTC", "hi!", strArray6);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder3.maximumParsedDigits(59);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder9.append(periodFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No formatter supplied");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendSeparatorIfFieldsAfter("Jan");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder8.appendSuffix("2024-04-09T18:59:01.044-07:00/2024-04-09T18:59:01.044-07:00", "");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        java.lang.String[] strArray6 = null;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder3.appendSeparator("UTC", "hi!", strArray6);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.printZeroRarelyLast();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder.Literal literal3 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        java.util.Locale locale5 = null;
        int int6 = literal3.calculatePrintedLength(readablePeriod4, locale5);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.printZeroRarelyLast();
        org.joda.time.format.PeriodParser periodParser9 = periodFormatterBuilder8.toParser();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder1.append((org.joda.time.format.PeriodPrinter) literal3, periodParser9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(literal3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodParser9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        java.lang.String[] strArray6 = null;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder3.appendSeparator("UTC", "hi!", strArray6);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder3.maximumParsedDigits(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder9.appendSeparator("Jan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        java.lang.String[] strArray6 = null;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder3.appendSeparator("UTC", "hi!", strArray6);
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatterBuilder3.toPrinter();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(0L, periodType10);
        org.joda.time.Period period13 = period11.plusMonths((int) (short) 0);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = period13.toMutablePeriod();
        java.util.Locale locale16 = null;
        int int17 = periodPrinter8.calculatePrintedLength((org.joda.time.ReadablePeriod) period13, locale16);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodPrinter8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendSeparatorIfFieldsAfter("Jan");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.appendSeparator("2024-04-10T01:59:10.939Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.printZeroNever();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.printZeroIfSupported();
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder4.appendSeparator("UnsupportedDateTimeField", "dayOfMonth", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Prefix not followed by field");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendMinutes();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis3Digit();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendYears();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis3Digit();
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatterBuilder3.toFormatter();
        java.util.Locale locale6 = periodFormatter5.getLocale();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendSeparatorIfFieldsAfter("Jan");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder7.printZeroRarelyLast();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder9.printZeroRarelyFirst();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.printZeroAlways();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.printZeroIfSupported();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroRarelyLast();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendHours();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.appendMonths();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodParser periodParser5 = periodFormatterBuilder3.toParser();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodParser5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendSeparatorIfFieldsAfter("Jan");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder6.appendSeparator("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroRarelyLast();
        org.joda.time.format.PeriodParser periodParser2 = periodFormatterBuilder1.toParser();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.maximumParsedDigits(9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodParser2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder4.appendSuffix("DurationField[halfdays]", "millisOfSecond");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.printZeroRarelyLast();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendDays();
        periodFormatterBuilder5.clear();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getShortName(0L);
        java.lang.String str4 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.nextTransition(0L);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.weekOfWeekyear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder12 = periodFormatterBuilder11.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder13 = periodFormatterBuilder11.appendSecondsWithOptionalMillis();
        boolean boolean14 = iSOChronology7.equals((java.lang.Object) periodFormatterBuilder11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = iSOChronology7.withZone(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder12);
        org.junit.Assert.assertNotNull(periodFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.maximumParsedDigits(80);
        java.lang.String[] strArray16 = new java.lang.String[] { "days", "2024-04-09T18:59:02.464-07:00/2024-04-09T18:59:02.464-07:00", "PT1M10.100S", "yearOfEra", "minuteOfHour" };
        org.joda.time.format.PeriodFormatterBuilder.Literal literal18 = new org.joda.time.format.PeriodFormatterBuilder.Literal("");
        org.joda.time.format.PeriodFormatterBuilder.Literal literal19 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.Period period24 = new org.joda.time.Period((int) (short) 0, (int) (short) 1, 10, 100);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        java.lang.String str27 = period24.toString();
        org.joda.time.format.PeriodFormatter periodFormatter28 = org.joda.time.format.ISOPeriodFormat.alternate();
        org.joda.time.format.PeriodParser periodParser29 = periodFormatter28.getParser();
        java.lang.String str30 = period24.toString(periodFormatter28);
        java.util.Locale locale31 = null;
        int int32 = literal19.calculatePrintedLength((org.joda.time.ReadablePeriod) period24, locale31);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(0L, periodType34);
        org.joda.time.Period period37 = period35.plusMonths((int) (short) 0);
        org.joda.time.PeriodType periodType38 = period37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = period37.toMutablePeriod();
        java.util.Locale locale41 = null;
        int int42 = literal19.countFieldsToPrint((org.joda.time.ReadablePeriod) period37, 0, locale41);
        org.joda.time.format.PeriodFormatterBuilder.Separator separator45 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "2024-04-10T01:59:05.733Z/2024-04-10T01:59:05.733Z", strArray16, (org.joda.time.format.PeriodPrinter) literal18, (org.joda.time.format.PeriodParser) literal19, false, true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder46 = periodFormatterBuilder6.appendSeparator("Jan", "PeriodType[Standard]", strArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder48 = periodFormatterBuilder46.appendSeparatorIfFieldsBefore("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(literal19);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT1M10.100S" + "'", str27, "PT1M10.100S");
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNotNull(periodParser29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "P00000000T000110.100" + "'", str30, "P00000000T000110.100");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(periodFormatterBuilder46);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.appendSeparatorIfFieldsBefore("2024-04-09T10:00:56.182Z/2024-04-09T10:00:56.182Z");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.printZeroNever();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder5.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatterBuilder5.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder3.append(periodFormatter8);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder9.appendHours();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.maximumParsedDigits(99);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatter periodFormatter1 = periodFormatterBuilder0.toFormatter();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(0L, periodType4);
        org.joda.time.Period period7 = period5.plusMonths((int) (short) 0);
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod9 = period7.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod9.toMutablePeriod();
        mutablePeriod9.setSeconds((int) ' ');
        mutablePeriod9.setYears(0);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Period period17 = readableInterval16.toPeriod();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Period period20 = readableInterval19.toPeriod();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period23 = new org.joda.time.Period((-1L), periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.days();
        boolean boolean25 = periodType22.isSupported(durationFieldType24);
        org.joda.time.Period period26 = readableInterval19.toPeriod(periodType22);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.Interval interval28 = readableInterval19.toInterval();
        boolean boolean29 = readableInterval16.overlaps(readableInterval19);
        mutablePeriod9.setPeriod(readableInterval19);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter1.printTo(stringBuffer2, (org.joda.time.ReadablePeriod) mutablePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.printZeroRarelyFirst();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendSeparatorIfFieldsAfter("2024-04-10T01:59:18.592Z/2024-04-10T01:59:18.592Z");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder8.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder10.appendSecondsWithMillis();
        java.lang.String[] strArray21 = new java.lang.String[] { "days", "2024-04-09T18:59:02.464-07:00/2024-04-09T18:59:02.464-07:00", "PT1M10.100S", "yearOfEra", "minuteOfHour" };
        org.joda.time.format.PeriodFormatterBuilder.Literal literal23 = new org.joda.time.format.PeriodFormatterBuilder.Literal("");
        org.joda.time.format.PeriodFormatterBuilder.Literal literal24 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.Period period29 = new org.joda.time.Period((int) (short) 0, (int) (short) 1, 10, 100);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        java.lang.String str32 = period29.toString();
        org.joda.time.format.PeriodFormatter periodFormatter33 = org.joda.time.format.ISOPeriodFormat.alternate();
        org.joda.time.format.PeriodParser periodParser34 = periodFormatter33.getParser();
        java.lang.String str35 = period29.toString(periodFormatter33);
        java.util.Locale locale36 = null;
        int int37 = literal24.calculatePrintedLength((org.joda.time.ReadablePeriod) period29, locale36);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(0L, periodType39);
        org.joda.time.Period period42 = period40.plusMonths((int) (short) 0);
        org.joda.time.PeriodType periodType43 = period42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = period42.toMutablePeriod();
        java.util.Locale locale46 = null;
        int int47 = literal24.countFieldsToPrint((org.joda.time.ReadablePeriod) period42, 0, locale46);
        org.joda.time.format.PeriodFormatterBuilder.Separator separator50 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "2024-04-10T01:59:05.733Z/2024-04-10T01:59:05.733Z", strArray21, (org.joda.time.format.PeriodPrinter) literal23, (org.joda.time.format.PeriodParser) literal24, false, true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder51 = periodFormatterBuilder11.appendSeparator("dayOfYear", "PT1M10.100S", strArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder52 = periodFormatterBuilder5.appendSeparator("minuteOfHour", "6", strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(literal24);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT1M10.100S" + "'", str32, "PT1M10.100S");
        org.junit.Assert.assertNotNull(periodFormatter33);
        org.junit.Assert.assertNotNull(periodParser34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "P00000000T000110.100" + "'", str35, "P00000000T000110.100");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(mutablePeriod44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(periodFormatterBuilder51);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatter periodFormatter1 = periodFormatterBuilder0.toFormatter();
        org.joda.time.format.PeriodPrinter periodPrinter2 = periodFormatterBuilder0.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("minuteOfHour");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.printZeroIfSupported();
        org.junit.Assert.assertNotNull(periodFormatter1);
        org.junit.Assert.assertNotNull(periodPrinter2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendSeparatorIfFieldsAfter("Jan");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder8.appendSeparatorIfFieldsBefore("Jan");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder11);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.rejectSignedValues(true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder6.minimumPrintedDigits(2);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.printZeroAlways();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendPrefix("minuteOfHour", "millisOfSecond");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendSecondsWithMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.maximumParsedDigits(80);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.appendMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.printZeroRarelyFirst();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendSeparatorIfFieldsAfter("2024-04-10T01:59:18.592Z/2024-04-10T01:59:18.592Z");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.appendMonths();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.maximumParsedDigits(99);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendSeparatorIfFieldsAfter("YearDay");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder3.appendSecondsWithOptionalMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendSeparator("2", "DurationField[millis]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder1.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendMonths();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.rejectSignedValues(false);
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatterBuilder3.toPrinter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodPrinter4);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendSecondsWithMillis();
        java.lang.String[] strArray13 = new java.lang.String[] { "days", "2024-04-09T18:59:02.464-07:00/2024-04-09T18:59:02.464-07:00", "PT1M10.100S", "yearOfEra", "minuteOfHour" };
        org.joda.time.format.PeriodFormatterBuilder.Literal literal15 = new org.joda.time.format.PeriodFormatterBuilder.Literal("");
        org.joda.time.format.PeriodFormatterBuilder.Literal literal16 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.Period period21 = new org.joda.time.Period((int) (short) 0, (int) (short) 1, 10, 100);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationTo(readableInstant22);
        java.lang.String str24 = period21.toString();
        org.joda.time.format.PeriodFormatter periodFormatter25 = org.joda.time.format.ISOPeriodFormat.alternate();
        org.joda.time.format.PeriodParser periodParser26 = periodFormatter25.getParser();
        java.lang.String str27 = period21.toString(periodFormatter25);
        java.util.Locale locale28 = null;
        int int29 = literal16.calculatePrintedLength((org.joda.time.ReadablePeriod) period21, locale28);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(0L, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) (short) 0);
        org.joda.time.PeriodType periodType35 = period34.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod36 = period34.toMutablePeriod();
        java.util.Locale locale38 = null;
        int int39 = literal16.countFieldsToPrint((org.joda.time.ReadablePeriod) period34, 0, locale38);
        org.joda.time.format.PeriodFormatterBuilder.Separator separator42 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "2024-04-10T01:59:05.733Z/2024-04-10T01:59:05.733Z", strArray13, (org.joda.time.format.PeriodPrinter) literal15, (org.joda.time.format.PeriodParser) literal16, false, true);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder43 = periodFormatterBuilder3.appendSeparator("dayOfYear", "PT1M10.100S", strArray13);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder45 = periodFormatterBuilder3.maximumParsedDigits(9);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder46 = periodFormatterBuilder45.appendHours();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder47 = periodFormatterBuilder45.printZeroRarelyFirst();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder48 = periodFormatterBuilder47.appendYears();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(literal16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT1M10.100S" + "'", str24, "PT1M10.100S");
        org.junit.Assert.assertNotNull(periodFormatter25);
        org.junit.Assert.assertNotNull(periodParser26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P00000000T000110.100" + "'", str27, "P00000000T000110.100");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(periodFormatterBuilder43);
        org.junit.Assert.assertNotNull(periodFormatterBuilder45);
        org.junit.Assert.assertNotNull(periodFormatterBuilder46);
        org.junit.Assert.assertNotNull(periodFormatterBuilder47);
        org.junit.Assert.assertNotNull(periodFormatterBuilder48);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatterBuilder1.toFormatter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter4.withLocale(locale5);
        boolean boolean7 = periodFormatter6.isPrinter();
        org.joda.time.Period period9 = periodFormatter6.parsePeriod("");
        org.joda.time.Period period11 = org.joda.time.Period.weeks(1);
        java.lang.String str12 = periodFormatter6.print((org.joda.time.ReadablePeriod) period11);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroRarelyLast();
        periodFormatterBuilder1.clear();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.appendSeparatorIfFieldsAfter("Jan");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder6.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder7.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder7.printZeroIfSupported();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendSeparatorIfFieldsBefore("");
        org.joda.time.format.PeriodFormatter periodFormatter4 = periodFormatterBuilder1.toFormatter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter4.withLocale(locale5);
        boolean boolean7 = periodFormatter6.isPrinter();
        org.joda.time.MutablePeriod mutablePeriod9 = periodFormatter6.parseMutablePeriod("");
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str13 = dateTimeZone11.getShortName(0L);
        java.lang.String str14 = dateTimeZone11.getID();
        long long16 = dateTimeZone11.nextTransition(0L);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.dayOfYear();
        org.joda.time.DurationField durationField19 = iSOChronology17.hours();
        org.joda.time.DurationField durationField20 = iSOChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.dayOfWeek();
        boolean boolean22 = mutablePeriod9.equals((java.lang.Object) iSOChronology17);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }
}


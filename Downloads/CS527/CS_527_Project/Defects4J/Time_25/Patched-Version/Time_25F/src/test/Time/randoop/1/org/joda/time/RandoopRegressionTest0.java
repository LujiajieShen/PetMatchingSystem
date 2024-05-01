package org.joda.time;

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
        byte byte0 = org.joda.time.DurationFieldType.MONTHS;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 5 + "'", byte0 == (byte) 5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) ' ', 10, (int) 'a', (int) 'a', (int) (byte) -1, (int) '#', chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, 0, (int) (byte) 100, (int) (byte) 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        byte byte0 = org.joda.time.DurationFieldType.CENTURIES;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 2 + "'", byte0 == (byte) 2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial2 = null;
        int[] intArray10 = new int[] { (byte) -1, (-1), (byte) 7, (byte) 0, (byte) 5, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = dateTimeField1.addWrapField(readablePartial2, (int) '4', intArray10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 7, 0, 5, 10]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        long long6 = durationField3.getValueAsLong((long) 0, 1712715987735L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gregorianChronology1.getDateTimeMillis((int) (short) 0, (int) (byte) 0, (int) (short) 1, (int) (byte) 7, (int) (short) -1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = gregorianChronology0.set(readablePartial5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        int int6 = durationField3.getValue((long) (short) -1, 1L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.monthOfYear();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray7 = new int[] {};
        int int8 = dateTimeField5.getMaximumValue(readablePartial6, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            gregorianChronology0.validate(readablePartial2, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gregorianChronology5.getDateTimeMillis((int) (short) 0, (int) (byte) 0, 10, (int) (short) 10, (int) (short) 100, (int) (byte) 7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gregorianChronology0.getDateTimeMillis((int) (byte) 11, (int) (short) -1, 1, (int) '#', (int) ' ', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gregorianChronology0.get(readablePeriod5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte byte0 = org.joda.time.DurationFieldType.YEARS;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology0.getDateTimeMillis((int) (byte) 7, (int) (byte) 5, (int) 'a', (-100), (-100), (int) (short) 100, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray18 = new int[] { (byte) 0, '#', 'a', (byte) 1, (byte) 2, (short) 10 };
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = zeroIsMaxDateTimeField9.set(readablePartial10, (int) (byte) 100, intArray18, "", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 35, 97, 1, 2, 10]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 4, (int) (short) -1, (int) (byte) 10, 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        byte byte0 = org.joda.time.DateTimeFieldType.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 19 + "'", byte0 == (byte) 19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.monthOfYear();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray18 = new int[] {};
        int int19 = dateTimeField16.getMaximumValue(readablePartial17, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = zeroIsMaxDateTimeField9.set(readablePartial12, (int) (short) 0, intArray18, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for centuryOfEra must be in the range [1,60]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = zeroIsMaxDateTimeField9.addWrapPartial(readablePartial10, (int) (byte) 100, intArray12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = dateTimeField4.getMaximumShortTextLength(locale5);
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray9 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = dateTimeField4.set(readablePartial7, 0, intArray9, "hi!", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = zeroIsMaxDateTimeField9.getMaximumValue(readablePartial12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, (int) (short) 0, (int) (byte) 19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for centuryOfEra must be in the range [19,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        byte byte0 = org.joda.time.DateTimeFieldType.YEAR_OF_CENTURY;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gregorianChronology0.get(readablePeriod3, (long) 0, (long) (byte) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = dateTimeField2.getLeapDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNull(durationField3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No file directory provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean7 = dateTimeZone5.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone5.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone5.getName(1712715987735L, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTimeField3, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.BasicDayOfMonthDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = gregorianChronology0.getDateTimeMillis((long) (short) 100, 54, (int) 'a', 54, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) 10, 10, (-100), (int) '4', (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        long long7 = durationField4.getMillis(10L, (long) (-1));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.WEEKYEARS_TYPE;
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        byte byte0 = org.joda.time.DateTimeFieldType.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 17 + "'", byte0 == (byte) 17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = zeroIsMaxDateTimeField9.getMaximumValue(readablePartial12);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = offsetDateTimeField8.addWrapField(0L, (int) (byte) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1712715991341L + "'", long0 == 1712715991341L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeField2.getAsShortText(0L, locale4);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.DurationField durationField0 = org.joda.time.field.MillisDurationField.INSTANCE;
        org.junit.Assert.assertNotNull(durationField0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.String str2 = jodaTimePermission1.getActions();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField((org.joda.time.Chronology) gregorianChronology4);
        java.lang.String str6 = dateTimeFieldType3.toString();
        org.joda.time.IllegalFieldValueException illegalFieldValueException10 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType3, (java.lang.Number) 10L, (java.lang.Number) 100, (java.lang.Number) 1L);
        jodaTimePermission1.checkGuard((java.lang.Object) 10L);
        java.lang.String str12 = jodaTimePermission1.getActions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yearOfCentury" + "'", str6, "yearOfCentury");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = dateTimeFormatter0.parseLocalDate("60");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"60\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 100, (int) (byte) 2, 100, (int) (short) -1, (int) (byte) 11, (int) (byte) 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology4.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DurationField durationField11 = gregorianChronology9.weeks();
        boolean boolean12 = gregorianChronology4.equals((java.lang.Object) durationField11);
        int int13 = durationField3.compareTo(durationField11);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = gregorianChronology0.set(readablePartial3, 1712715987735L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (long) (byte) 14, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfMinute();
        boolean boolean3 = dateTimeField2.isSupported();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        byte byte0 = org.joda.time.DurationFieldType.SECONDS;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 11 + "'", byte0 == (byte) 11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        byte byte0 = org.joda.time.DateTimeFieldType.MINUTE_OF_DAY;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 18 + "'", byte0 == (byte) 18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology5.getZone();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10, (int) (byte) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 9");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        java.lang.String str9 = offsetDateTimeField8.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = offsetDateTimeField8.add((long) 60, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1977 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateTimeField[era]" + "'", str9, "DateTimeField[era]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray12 = new int[] {};
        int int13 = dateTimeField10.getMaximumValue(readablePartial11, intArray12);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField4.set(readablePartial6, 54, intArray12, "DateTimeField[era]", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[era]\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.Chronology chronology5 = gregorianChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology5.get(readablePeriod6, 0L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.monthOfYear();
        org.joda.time.DurationField durationField9 = gregorianChronology6.hours();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField11 = gregorianChronology6.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) 100, (int) (byte) 19, 10, (int) (byte) 11, (int) (byte) 7, (int) ' ', (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        byte byte0 = org.joda.time.DateTimeFieldType.ERA;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.ReadablePartial readablePartial0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.joda.time.DateTimeUtils.isContiguous(readablePartial0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        org.joda.time.DurationField durationField10 = zeroIsMaxDateTimeField9.getRangeDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        java.lang.String str3 = dateTimeFieldType0.toString();
        org.joda.time.IllegalFieldValueException illegalFieldValueException7 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 10L, (java.lang.Number) 100, (java.lang.Number) 1L);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            illegalFieldValueException7.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yearOfCentury" + "'", str3, "yearOfCentury");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDurationField10.getValue((long) (byte) 0, (long) (byte) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        long long9 = dateTimeField4.set(9001L, (int) (byte) 8);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8001L + "'", long9 == 8001L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.DateTimeUtils.FixedMillisProvider fixedMillisProvider1 = new org.joda.time.DateTimeUtils.FixedMillisProvider((long) (short) 100);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = offsetDateTimeField8.add(4L, 60);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2037 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationField durationField1 = null;
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str3 = iSOChronology2.toString();
        org.joda.time.DurationField durationField4 = iSOChronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField5 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, durationField1, durationField4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[UTC]" + "'", str3, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial19 = null;
        int[] intArray23 = new int[] { (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = zeroIsMaxDateTimeField9.add(readablePartial19, (int) '#', intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.hourOfDay();
        org.joda.time.DurationField durationField9 = gregorianChronology6.days();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology6.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) (byte) 10, (int) (byte) 0, 18981, (int) (short) 1, (int) (byte) 18, (int) (short) 0, (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (long) (byte) 19, (int) (byte) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        java.lang.String str11 = zeroIsMaxDateTimeField9.getAsShortText((long) (short) 1);
        boolean boolean13 = zeroIsMaxDateTimeField9.isLeap((long) (byte) 11);
        org.joda.time.DurationField durationField14 = zeroIsMaxDateTimeField9.getLeapDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "60" + "'", str11, "60");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readablePartial2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology5.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology5.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        long long6 = durationField4.getMillis((long) (byte) 8);
        long long9 = durationField4.subtract((long) (byte) 0, 0L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8000L + "'", long6 == 8000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gregorianChronology1.getDateTimeMillis((int) (byte) 17, (int) '4', (int) (byte) 2, (int) ' ', (int) (byte) 23, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gregorianChronology0.get(readablePeriod5, (long) (byte) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte byte0 = org.joda.time.DateTimeFieldType.YEAR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 5 + "'", byte0 == (byte) 5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        boolean boolean5 = dateTimeField4.isLenient();
        int int7 = dateTimeField4.getLeapAmount((long) (byte) 17);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (long) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        java.lang.String str9 = offsetDateTimeField8.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = offsetDateTimeField8.add(1012L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2009 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateTimeField[era]" + "'", str9, "DateTimeField[era]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDurationField10.getValueAsLong(9001L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.joda.time.DateTimeUtils dateTimeUtils0 = new org.joda.time.DateTimeUtils();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTime();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dateTimeFormatter0.parseMillis("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int12 = offsetDateTimeField8.getMaximumValue();
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale15 = null;
        java.lang.String str16 = offsetDateTimeField8.getAsText(readablePartial13, 54, locale15);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = offsetDateTimeField8.add((long) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1975 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "54" + "'", str16, "54");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMinimumValue();
        int int21 = zeroIsMaxDateTimeField9.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = zeroIsMaxDateTimeField9.getAsShortText(readablePartial22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField9.set((long) (byte) 7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = unsupportedDateTimeField9.getAsText((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException(durationFieldType0, "-00:00:00.001");
        java.lang.String str3 = illegalFieldValueException2.getIllegalValueAsString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        long long6 = durationField4.getMillis((long) (byte) 8);
        boolean boolean7 = durationField4.isSupported();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8000L + "'", long6 == 8000L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTime5.toString("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = unsupportedDateTimeField9.getAsText(readablePartial10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withEra((int) (byte) 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeField3.getAsShortText(readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = unsupportedDurationField10.getDifferenceAsLong(1L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = unsupportedDateTimeField9.roundCeiling((long) (byte) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = gregorianChronology0.getDateTimeMillis(10L, (-1), (int) (byte) 7, (int) (byte) 5, 2024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = unsupportedDurationField10.getDifferenceAsLong((long) (-100), (long) (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = gregorianChronology0.set(readablePartial4, 9001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology0.hours();
        long long8 = durationField5.getDifferenceAsLong((long) (byte) 6, (long) (byte) 18);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology3 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology0.getZone();
        java.lang.String str5 = dateTimeZone4.getID();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = unsupportedDateTimeField9.remainder(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) '#', locale9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = gregorianChronology11.hours();
        boolean boolean15 = dateTimeZone7.equals((java.lang.Object) gregorianChronology11);
        java.lang.String str17 = dateTimeZone7.getNameKey((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(9, 12, (int) ' ', 100, 0, 0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DurationField durationField4 = gregorianChronology2.weeks();
        int int7 = durationField4.getValue((long) (byte) 5, 0L);
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology8.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gregorianChronology8.hours();
        org.joda.time.DurationField durationField14 = gregorianChronology8.seconds();
        long long17 = durationField14.subtract((long) (byte) 6, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField18 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, durationField4, durationField14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99994L) + "'", long17 == (-99994L));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 60, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2100L + "'", long2 == 2100L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        byte byte0 = org.joda.time.DateTimeFieldType.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 21 + "'", byte0 == (byte) 21);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long14 = zeroIsMaxDateTimeField9.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial15 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = gregorianChronology16.hours();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology16.secondOfMinute();
        boolean boolean22 = dateTimeField20.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str24 = dateTimeFieldType23.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField25 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField20, dateTimeFieldType23);
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.monthOfYear();
        org.joda.time.DurationField durationField30 = gregorianChronology27.hours();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology27.secondOfMinute();
        boolean boolean33 = dateTimeField31.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str35 = dateTimeFieldType34.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField36 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField31, dateTimeFieldType34);
        long long38 = zeroIsMaxDateTimeField36.roundFloor((long) 100);
        long long40 = zeroIsMaxDateTimeField36.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale43 = null;
        java.lang.String str44 = zeroIsMaxDateTimeField36.getAsText(readablePartial41, (int) (byte) 7, locale43);
        int int45 = zeroIsMaxDateTimeField36.getMinimumValue();
        int int48 = zeroIsMaxDateTimeField36.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology50 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology50.monthOfYear();
        org.joda.time.ReadablePartial readablePartial53 = null;
        int[] intArray54 = new int[] {};
        int int55 = dateTimeField52.getMaximumValue(readablePartial53, intArray54);
        int int56 = zeroIsMaxDateTimeField36.getMinimumValue(readablePartial49, intArray54);
        int int57 = dateTimeField20.getMinimumValue(readablePartial26, intArray54);
        int int58 = zeroIsMaxDateTimeField9.getMinimumValue(readablePartial15, intArray54);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "centuryOfEra" + "'", str24, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "centuryOfEra" + "'", str35, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 999L + "'", long40 == 999L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "7" + "'", str44, "7");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 12 + "'", int55 == 12);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) (byte) 11, (java.lang.Number) (short) 0, (java.lang.Number) (short) 100);
        java.lang.Number number5 = illegalFieldValueException4.getUpperBound();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + (short) 100 + "'", number5, (short) 100);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.junit.Assert.assertNotNull(gregorianChronology0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2024 + "'", int2 == 2024);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        boolean boolean3 = dateTimeField2.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("yearOfCentury", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"yearOfCentury\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField9.roundHalfFloor((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone8.isLocalDateTimeGap(localDateTime11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName(1712715987735L, locale14);
        long long17 = dateTimeZone8.previousTransition(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((int) (byte) 7, (int) (byte) 2, (-1), (int) '4', 18, (int) (short) 10, (int) (byte) 11, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField9.set(0L, "1", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int14 = offsetDateTimeField8.getDifference(12L, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long17 = offsetDateTimeField8.add(0L, (int) (byte) 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1992 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        byte byte0 = org.joda.time.DateTimeFieldType.CLOCKHOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 16 + "'", byte0 == (byte) 16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.weekyear();
        java.lang.String str3 = dateTimeField2.toString();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DateTimeField[weekyear]" + "'", str3, "DateTimeField[weekyear]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDurationField10.getDifferenceAsLong(0L, (long) 18981);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int12 = offsetDateTimeField8.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = offsetDateTimeField8.addWrapField(10000L, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long12 = zeroIsMaxDateTimeField9.add(12L, (long) (byte) 1);
        int int14 = zeroIsMaxDateTimeField9.get(32001L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1012L + "'", long12 == 1012L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = unsupportedDurationField10.getMillis(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, readablePartial2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField9.roundCeiling((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField5 = new org.joda.time.field.PreciseDurationField(durationFieldType3, (-99994L));
        int int8 = preciseDurationField5.getValue((long) 1, (long) (byte) 8);
        long long11 = preciseDurationField5.getMillis(2024, 0L);
        int int12 = durationField2.compareTo((org.joda.time.DurationField) preciseDurationField5);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-202387856L) + "'", long11 == (-202387856L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        int int36 = dividedDateTimeField29.getMinimumValue();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField16 = gregorianChronology13.hours();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology13.secondOfMinute();
        boolean boolean19 = dateTimeField17.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField22 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField17, dateTimeFieldType20);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.monthOfYear();
        org.joda.time.DurationField durationField27 = gregorianChronology24.hours();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology24.secondOfMinute();
        boolean boolean30 = dateTimeField28.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str32 = dateTimeFieldType31.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField33 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField28, dateTimeFieldType31);
        long long35 = zeroIsMaxDateTimeField33.roundFloor((long) 100);
        long long37 = zeroIsMaxDateTimeField33.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = null;
        java.lang.String str41 = zeroIsMaxDateTimeField33.getAsText(readablePartial38, (int) (byte) 7, locale40);
        int int42 = zeroIsMaxDateTimeField33.getMinimumValue();
        int int45 = zeroIsMaxDateTimeField33.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology47 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology47.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology47.monthOfYear();
        org.joda.time.ReadablePartial readablePartial50 = null;
        int[] intArray51 = new int[] {};
        int int52 = dateTimeField49.getMaximumValue(readablePartial50, intArray51);
        int int53 = zeroIsMaxDateTimeField33.getMinimumValue(readablePartial46, intArray51);
        int int54 = dateTimeField17.getMinimumValue(readablePartial23, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = unsupportedDateTimeField9.getMinimumValue(readablePartial12, intArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "centuryOfEra" + "'", str21, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "centuryOfEra" + "'", str32, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 999L + "'", long37 == 999L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "7" + "'", str41, "7");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 12 + "'", int52 == 12);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, readablePartial2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology5.getZone();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        boolean boolean12 = dateTimeZone10.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "160000-0800");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gregorianChronology0.get(readablePeriod7, (long) 200, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unsupportedDateTimeField9.isLeap((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        org.joda.time.DurationField durationField10 = dateTimeField4.getRangeDurationField();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeField4.getAsShortText((-61851226021989L), locale12);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "58" + "'", str13, "58");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, (int) (short) 10, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for centuryOfEra must be in the range [10,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(1712715987735L, locale7);
        long long10 = dateTimeZone1.previousTransition(100L);
        java.lang.String str12 = dateTimeZone1.getName((long) 32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dateTimeField1.set(9001L, "ISOChronology[America/Los_Angeles]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[America/Los_Angeles]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.clockhourOfHalfday();
        long long9 = dateTimeField6.set((long) (byte) 22, "7");
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25200022L + "'", long9 == 25200022L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(2024, (int) ' ', 12, 10, 18, (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unsupportedDateTimeField9.isLeap((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeField5.set((long) 0, "0");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((-9L));
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.ReadablePartial readablePartial36 = null;
        int int37 = dividedDateTimeField29.getMinimumValue(readablePartial36);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = dividedDateTimeField29.remainder((-62111231992995L));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 64 for centuryOfEra must be in the range [1,60]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long38 = dividedDateTimeField29.remainder(54012L);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73 for centuryOfEra must be in the range [1,60]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = readableInterval1.isBefore(readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInstant4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        boolean boolean9 = readableInterval7.isBefore(readableInstant8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        boolean boolean12 = readableInterval7.isBefore(readableInterval10);
        boolean boolean13 = readableInterval1.contains(readableInterval10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("UTC", (int) '4', 18981, 54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for UTC must be in the range [18981,54]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = gregorianChronology1.withZone(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        long long7 = durationField4.getValueAsLong(0L, 100L);
        org.joda.time.DurationFieldType durationFieldType8 = durationField4.getType();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        org.joda.time.DurationField durationField12 = offsetDateTimeField8.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = gregorianChronology15.weeks();
        int int19 = durationField16.getValue((long) (short) 10, (long) 10);
        long long21 = durationField16.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField22 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType13, durationField16);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField8, dateTimeFieldType13, (int) (byte) 21);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = offsetDateTimeField8.add((long) (byte) 23, (long) (byte) 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1982 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "centuryOfEra" + "'", str14, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        int int6 = dateTime4.getSecondOfDay();
        java.util.Date date7 = dateTime4.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2024 + "'", int2 == 2024);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1712716000046L + "'", long5 == 1712716000046L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70000 + "'", int6 == 70000);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Apr 09 19:26:40 PDT 2024");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology3 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = dateTimeField4.getLeapDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dayOfWeek" + "'", str6, "dayOfWeek");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(9001L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        byte byte0 = org.joda.time.DurationFieldType.WEEKS;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 6 + "'", byte0 == (byte) 6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        long long18 = zeroIsMaxDateTimeField9.add(12L, (int) (byte) 17);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay23 = dateTime22.toTimeOfDay();
        boolean boolean24 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay23);
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay23, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 17012L + "'", long18 == 17012L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long14 = zeroIsMaxDateTimeField9.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale17 = null;
        java.lang.String str18 = zeroIsMaxDateTimeField9.getAsText(readablePartial15, (int) (short) -1, locale17);
        long long20 = zeroIsMaxDateTimeField9.roundFloor((long) 0);
        long long22 = zeroIsMaxDateTimeField9.roundFloor(54012L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 54000L + "'", long22 == 54000L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.YEARS_TYPE;
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = gregorianChronology0.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTime6.toString("ISOChronology[UTC]", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        long long18 = zeroIsMaxDateTimeField9.add(12L, (int) (byte) 17);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay23 = dateTime22.toTimeOfDay();
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = zeroIsMaxDateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 17012L + "'", long18 == 17012L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.DurationField durationField5 = gregorianChronology1.hours();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        java.util.Locale locale12 = null;
        long long13 = zeroIsMaxDateTimeField9.set(12L, "54", locale12);
        int int15 = zeroIsMaxDateTimeField9.getMinimumValue((-62111231999995L));
        int int17 = zeroIsMaxDateTimeField9.getMinimumValue((long) (byte) 19);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 54012L + "'", long13 == 54012L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("(\"org.joda.time.JodaTimePermission\" \"hi!\")");
        java.security.Permission permission2 = null;
        boolean boolean3 = jodaTimePermission1.implies(permission2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        int int6 = dateTime4.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withEra(70000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70000 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2024 + "'", int2 == 2024);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1712716001019L + "'", long5 == 1712716001019L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70001 + "'", int6 == 70001);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dateTime6.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long12 = zeroIsMaxDateTimeField9.add(12L, (long) (byte) 1);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay17 = dateTime16.toTimeOfDay();
        boolean boolean18 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay17);
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = zeroIsMaxDateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay17, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1012L + "'", long12 == 1012L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        long long12 = offsetDateTimeField8.roundHalfEven(25200022L);
        long long14 = offsetDateTimeField8.remainder(12L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 12L + "'", long14 == 12L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        java.lang.String str9 = offsetDateTimeField8.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = offsetDateTimeField8.addWrapField((long) 1969, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateTimeField[era]" + "'", str9, "DateTimeField[era]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMinimumValue();
        int int21 = zeroIsMaxDateTimeField9.getDifference(10L, (long) (short) 1);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay26 = dateTime25.toTimeOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology28 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology28.monthOfYear();
        org.joda.time.DurationField durationField31 = gregorianChronology28.hours();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology28.secondOfMinute();
        boolean boolean34 = dateTimeField32.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str36 = dateTimeFieldType35.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField37 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField32, dateTimeFieldType35);
        org.joda.time.ReadablePartial readablePartial38 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology39.monthOfYear();
        org.joda.time.DurationField durationField42 = gregorianChronology39.hours();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology39.secondOfMinute();
        boolean boolean45 = dateTimeField43.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str47 = dateTimeFieldType46.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField48 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField43, dateTimeFieldType46);
        long long50 = zeroIsMaxDateTimeField48.roundFloor((long) 100);
        long long52 = zeroIsMaxDateTimeField48.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial53 = null;
        java.util.Locale locale55 = null;
        java.lang.String str56 = zeroIsMaxDateTimeField48.getAsText(readablePartial53, (int) (byte) 7, locale55);
        int int57 = zeroIsMaxDateTimeField48.getMinimumValue();
        int int60 = zeroIsMaxDateTimeField48.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial61 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology62 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology62.dayOfYear();
        org.joda.time.DateTimeField dateTimeField64 = gregorianChronology62.monthOfYear();
        org.joda.time.ReadablePartial readablePartial65 = null;
        int[] intArray66 = new int[] {};
        int int67 = dateTimeField64.getMaximumValue(readablePartial65, intArray66);
        int int68 = zeroIsMaxDateTimeField48.getMinimumValue(readablePartial61, intArray66);
        int int69 = dateTimeField32.getMinimumValue(readablePartial38, intArray66);
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray72 = zeroIsMaxDateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay26, 0, intArray66, "99", locale71);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for centuryOfEra must be in the range [1,60]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(gregorianChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "centuryOfEra" + "'", str36, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "centuryOfEra" + "'", str47, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 999L + "'", long52 == 999L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "7" + "'", str56, "7");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 12 + "'", int67 == 12);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        int int6 = dateTime4.getSecondOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfCentury(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2024 + "'", int2 == 2024);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1712716001828L + "'", long5 == 1712716001828L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70001 + "'", int6 == 70001);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (long) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (byte) 1);
        int int11 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        int int12 = dateTime5.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) (-100));
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology4.centuryOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) timeOfDay13, 99, locale15);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadablePartial) timeOfDay13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "99" + "'", str16, "99");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = gregorianChronology3.equals((java.lang.Object) durationField10);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField12 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField10);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = unsupportedDateTimeField12.getAsText((long) 70000, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: yearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        int int5 = dateTime3.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime3.withMonthOfYear((int) (byte) 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        boolean boolean12 = unsupportedDurationField10.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getDifferenceAsLong(1012L, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.monthOfYear();
        org.joda.time.DurationField durationField15 = gregorianChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology12.centuryOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay21 = dateTime20.toTimeOfDay();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) timeOfDay21, 99, locale23);
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.monthOfYear();
        org.joda.time.DurationField durationField29 = gregorianChronology26.hours();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology26.secondOfMinute();
        boolean boolean32 = dateTimeField30.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str34 = dateTimeFieldType33.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField35 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField30, dateTimeFieldType33);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology37.monthOfYear();
        org.joda.time.DurationField durationField40 = gregorianChronology37.hours();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology37.secondOfMinute();
        boolean boolean43 = dateTimeField41.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str45 = dateTimeFieldType44.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField46 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField41, dateTimeFieldType44);
        long long48 = zeroIsMaxDateTimeField46.roundFloor((long) 100);
        long long50 = zeroIsMaxDateTimeField46.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = null;
        java.lang.String str54 = zeroIsMaxDateTimeField46.getAsText(readablePartial51, (int) (byte) 7, locale53);
        int int55 = zeroIsMaxDateTimeField46.getMinimumValue();
        int int58 = zeroIsMaxDateTimeField46.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial59 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology60 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField61 = gregorianChronology60.dayOfYear();
        org.joda.time.DateTimeField dateTimeField62 = gregorianChronology60.monthOfYear();
        org.joda.time.ReadablePartial readablePartial63 = null;
        int[] intArray64 = new int[] {};
        int int65 = dateTimeField62.getMaximumValue(readablePartial63, intArray64);
        int int66 = zeroIsMaxDateTimeField46.getMinimumValue(readablePartial59, intArray64);
        int int67 = dateTimeField30.getMinimumValue(readablePartial36, intArray64);
        java.util.Locale locale69 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray70 = unsupportedDateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay21, 8, intArray64, "GregorianChronology[UTC]", locale69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "99" + "'", str24, "99");
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "centuryOfEra" + "'", str34, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "centuryOfEra" + "'", str45, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 999L + "'", long50 == 999L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "7" + "'", str54, "7");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 12 + "'", int65 == 12);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.millisOfSecond();
        boolean boolean7 = dateTimeField5.isLeap((long) 10);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.Number number1 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, number1, (java.lang.Number) (byte) 100, (java.lang.Number) (byte) 100);
        java.lang.String str5 = illegalFieldValueException4.getIllegalStringValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getShortName((long) '#', locale10);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.monthOfYear();
        org.joda.time.DurationField durationField15 = gregorianChronology12.hours();
        boolean boolean16 = dateTimeZone8.equals((java.lang.Object) gregorianChronology12);
        java.lang.String str18 = dateTimeZone8.getNameKey((-1L));
        long long22 = dateTimeZone8.convertLocalToUTC(12L, false, 54000L);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 13L + "'", long22 == 13L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long14 = zeroIsMaxDateTimeField9.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        java.lang.String str15 = zeroIsMaxDateTimeField9.toString();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateTimeField[centuryOfEra]" + "'", str15, "DateTimeField[centuryOfEra]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("GregorianChronology[UTC]");
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 22, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 122L + "'", long2 == 122L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.monthOfYear();
        org.joda.time.DurationField durationField15 = gregorianChronology12.hours();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology12.secondOfMinute();
        boolean boolean18 = dateTimeField16.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str20 = dateTimeFieldType19.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField21 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField16, dateTimeFieldType19);
        long long23 = zeroIsMaxDateTimeField21.roundFloor((long) 100);
        long long25 = zeroIsMaxDateTimeField21.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = null;
        java.lang.String str29 = zeroIsMaxDateTimeField21.getAsText(readablePartial26, (int) (byte) 7, locale28);
        int int30 = zeroIsMaxDateTimeField21.getMaximumValue();
        java.util.Locale locale32 = null;
        java.lang.String str33 = zeroIsMaxDateTimeField21.getAsText(12, locale32);
        long long36 = zeroIsMaxDateTimeField21.add(1L, (int) (byte) 9);
        java.lang.Object obj37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj37);
        org.joda.time.DateTime dateTime40 = dateTime38.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay41 = dateTime40.toTimeOfDay();
        int int42 = zeroIsMaxDateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay41);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = unsupportedDateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "centuryOfEra" + "'", str20, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 999L + "'", long25 == 999L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "7" + "'", str29, "7");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "12" + "'", str33, "12");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9001L + "'", long36 == 9001L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        long long7 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime6);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1712629604846L + "'", long7 == 1712629604846L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gregorianChronology0.add(readablePeriod3, (long) (byte) 4, (int) ' ');
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.era();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(0, (int) (byte) 100, 10, (int) (byte) 17, (int) (byte) 8, 8, 69996, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69996 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = readableInterval1.getChronology();
        org.joda.time.Interval interval6 = readableInterval1.toInterval();
        java.lang.String str7 = readableInterval1.toString();
        org.joda.time.Period period8 = readableInterval1.toPeriod();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2024-04-09T19:26:43.898/2024-04-09T19:26:43.898" + "'", str7, "2024-04-09T19:26:43.898/2024-04-09T19:26:43.898");
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        java.lang.String str8 = dateTime3.toString("60");
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "60" + "'", str8, "60");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime7 = dateTime5.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = gregorianChronology8.weeks();
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        boolean boolean12 = dateTime5.equals((java.lang.Object) durationField11);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField5.set((long) (byte) 21, "GregorianChronology[UTC]", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GregorianChronology[UTC]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.millisOfSecond();
        org.joda.time.DurationField durationField3 = gregorianChronology1.hours();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 40, (org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        java.util.Locale locale20 = null;
        java.lang.String str21 = zeroIsMaxDateTimeField9.getAsText(12, locale20);
        long long24 = zeroIsMaxDateTimeField9.add(1L, (int) (byte) 9);
        int int26 = zeroIsMaxDateTimeField9.get(0L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12" + "'", str21, "12");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9001L + "'", long24 == 9001L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        boolean boolean8 = dateTimeZone3.isStandardOffset((long) (short) -1);
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        boolean boolean9 = readableInterval1.equals((java.lang.Object) dateTime7);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusYears(0);
        boolean boolean14 = readableInterval1.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withChronology(chronology15);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField9.getAsText((-9L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = gregorianChronology0.getDateTimeMillis(12, (-1), 69996, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField6 = gregorianChronology1.centuries();
        long long8 = durationField6.getMillis(1L);
        boolean boolean9 = durationField6.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3155695200000L + "'", long8 == 3155695200000L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dateTimeParser1.parseInto(dateTimeParserBucket2, "00:00:00Z", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        java.util.Locale locale20 = null;
        java.lang.String str21 = zeroIsMaxDateTimeField9.getAsText(12, locale20);
        long long24 = zeroIsMaxDateTimeField9.addWrapField(1012L, 0);
        int int26 = zeroIsMaxDateTimeField9.get(1012L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12" + "'", str21, "12");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1012L + "'", long24 == 1012L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = unsupportedDateTimeField9.getAsText(99, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = gregorianChronology3.equals((java.lang.Object) durationField10);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField12 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField12.set(1712715996281L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: yearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.DateTime dateTime4 = dateTime1.minusMonths((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime();
        int int6 = dateTime1.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2024 + "'", int2 == 2024);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 769 + "'", int6 == 769);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = dateTimeFormatter0.parseMillis("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"centuryOfEra\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime3.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = readableInterval1.getChronology();
        org.joda.time.Interval interval6 = readableInterval1.toInterval();
        java.lang.String str7 = readableInterval1.toString();
        long long8 = readableInterval1.getEndMillis();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2024-04-09T19:26:44.843/2024-04-09T19:26:44.843" + "'", str7, "2024-04-09T19:26:44.843/2024-04-09T19:26:44.843");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712716004843L + "'", long8 == 1712716004843L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField9.addWrapField((-6048000001L), (int) (byte) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnsupportedDateTimeField" + "'", str11, "UnsupportedDateTimeField");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        org.joda.time.DurationField durationField12 = offsetDateTimeField8.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = gregorianChronology15.weeks();
        int int19 = durationField16.getValue((long) (short) 10, (long) 10);
        long long21 = durationField16.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField22 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType13, durationField16);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField8, dateTimeFieldType13, (int) (byte) 21);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = dividedDateTimeField24.roundHalfCeiling((long) 69996);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1974 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "centuryOfEra" + "'", str14, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField22);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = unsupportedDurationField10.getValueAsLong((long) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 70001, (int) (byte) 21);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1470021L + "'", long2 == 1470021L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MONTHS_TYPE;
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(0L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTime10.toString("99", locale13);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "99" + "'", str14, "99");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = dateTime1.getZone();
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 1);
        boolean boolean7 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = gregorianChronology8.weeks();
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = dateTime4.equals((java.lang.Object) gregorianChronology8);
        int int12 = dateTime4.getYear();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime4.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2024 + "'", int12 == 2024);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) (short) 10, locale8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeParser11);
        java.lang.String str15 = dateTimeZone1.getName((-62111231992995L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-00:00:00.001" + "'", str15, "-00:00:00.001");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long14 = zeroIsMaxDateTimeField9.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial15 = null;
        java.util.Locale locale17 = null;
        java.lang.String str18 = zeroIsMaxDateTimeField9.getAsText(readablePartial15, (int) (short) -1, locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = zeroIsMaxDateTimeField9.getAsText((int) (byte) 21, locale20);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "21" + "'", str21, "21");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField16 = gregorianChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology13.centuryOfEra();
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay22 = dateTime21.toTimeOfDay();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) timeOfDay22, 99, locale24);
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.monthOfYear();
        org.joda.time.DurationField durationField30 = gregorianChronology27.hours();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology27.secondOfMinute();
        boolean boolean33 = dateTimeField31.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str35 = dateTimeFieldType34.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField36 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField31, dateTimeFieldType34);
        long long38 = zeroIsMaxDateTimeField36.roundFloor((long) 100);
        long long40 = zeroIsMaxDateTimeField36.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale43 = null;
        java.lang.String str44 = zeroIsMaxDateTimeField36.getAsText(readablePartial41, (int) (byte) 7, locale43);
        int int45 = zeroIsMaxDateTimeField36.getMinimumValue();
        int int48 = zeroIsMaxDateTimeField36.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology50 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology50.monthOfYear();
        org.joda.time.ReadablePartial readablePartial53 = null;
        int[] intArray54 = new int[] {};
        int int55 = dateTimeField52.getMaximumValue(readablePartial53, intArray54);
        int int56 = zeroIsMaxDateTimeField36.getMinimumValue(readablePartial49, intArray54);
        java.util.Locale locale58 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray59 = unsupportedDateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay22, 0, intArray54, "org.joda.time.IllegalFieldValueException: Value \"-00:00:00.001\" for millis is not supported", locale58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "99" + "'", str25, "99");
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "centuryOfEra" + "'", str35, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 999L + "'", long40 == 999L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "7" + "'", str44, "7");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 12 + "'", int55 == 12);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        java.lang.String str9 = offsetDateTimeField8.toString();
        int int10 = offsetDateTimeField8.getMinimumValue();
        java.lang.String str11 = offsetDateTimeField8.getName();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateTimeField[era]" + "'", str9, "DateTimeField[era]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "era" + "'", str11, "era");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = dateTime1.getZone();
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 1);
        boolean boolean7 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = gregorianChronology8.weeks();
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = dateTime4.equals((java.lang.Object) gregorianChronology8);
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str13 = iSOChronology12.toString();
        org.joda.time.Chronology chronology14 = iSOChronology12.withUTC();
        boolean boolean15 = gregorianChronology8.equals((java.lang.Object) chronology14);
        java.lang.Class<?> wildcardClass16 = gregorianChronology8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[UTC]" + "'", str13, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField2 = gregorianChronology0.minutes();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gregorianChronology0.getDateTimeMillis((long) 60, (int) '#', (int) (byte) 0, (int) (byte) 16, 26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.Chronology chronology2 = dateTimeFormatter1.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("GregorianChronology[UTC]", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GregorianChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.joda.time.DateTimeUtils.FixedMillisProvider fixedMillisProvider1 = new org.joda.time.DateTimeUtils.FixedMillisProvider(1712716004371L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int14 = offsetDateTimeField8.getDifference(12L, (long) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType15.getField((org.joda.time.Chronology) gregorianChronology16);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField22 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField8, dateTimeFieldType15, 10);
        boolean boolean23 = offsetDateTimeField8.isLenient();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.String str2 = jodaTimePermission1.getActions();
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime4.getZone();
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusSeconds((int) (byte) 1);
        boolean boolean10 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = gregorianChronology11.weeks();
        org.joda.time.DurationField durationField13 = gregorianChronology11.weeks();
        boolean boolean14 = dateTime7.equals((java.lang.Object) gregorianChronology11);
        int int15 = dateTime7.getYear();
        boolean boolean16 = jodaTimePermission1.equals((java.lang.Object) int15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2024 + "'", int15 == 2024);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        java.lang.String str2 = durationField1.getName();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "weeks" + "'", str2, "weeks");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.WEEKS_TYPE;
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        int int10 = durationField3.getValue((long) 9);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        org.joda.time.DurationField durationField12 = offsetDateTimeField8.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = gregorianChronology15.weeks();
        int int19 = durationField16.getValue((long) (short) 10, (long) 10);
        long long21 = durationField16.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField22 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType13, durationField16);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField8, dateTimeFieldType13, (int) (byte) 21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField24, dateTimeFieldType25, 256000);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = dividedDateTimeField27.roundCeiling((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "centuryOfEra" + "'", str14, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int1 = org.joda.time.format.FormatUtils.calculateDigitCount((-62111231992995L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unsupportedDateTimeField9.getMaximumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnsupportedDateTimeField" + "'", str11, "UnsupportedDateTimeField");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        java.lang.String str9 = offsetDateTimeField8.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = offsetDateTimeField8.addWrapField((long) 19, 70001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateTimeField[era]" + "'", str9, "DateTimeField[era]");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDurationField10.getValue(8000L, (long) (byte) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gregorianChronology1.hours();
        boolean boolean5 = durationField4.isPrecise();
        long long8 = durationField4.getMillis(4, (long) (byte) 2);
        org.joda.time.DurationField durationField9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField10 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, durationField4, durationField9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 14400000L + "'", long8 == 14400000L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField7 = gregorianChronology5.weeks();
        boolean boolean8 = gregorianChronology0.equals((java.lang.Object) durationField7);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gregorianChronology0.getDateTimeMillis((int) (byte) 1, 0, 99, (int) '4', (int) (byte) 23, (int) (byte) 6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDate();
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str6 = dateTimeZone1.getID();
        boolean boolean7 = dateTimeZone1.isFixed();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gregorianChronology8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        org.joda.time.DurationField durationField19 = zeroIsMaxDateTimeField9.getRangeDurationField();
        int int21 = zeroIsMaxDateTimeField9.getLeapAmount((long) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = zeroIsMaxDateTimeField9.getAsText((int) (byte) 22, locale23);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "22" + "'", str24, "22");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDurationField10.getValue(1712716004371L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 17);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(1L, locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.017" + "'", str4, "+00:00:00.017");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        long long6 = gregorianChronology0.getDateTimeMillis((int) (byte) 1, 10, 10, (int) (byte) 5);
        java.lang.String str7 = gregorianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62111231999995L) + "'", long6 == (-62111231999995L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GregorianChronology[UTC]" + "'", str7, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) '#', locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withZone(dateTimeZone11);
        java.lang.String str16 = dateTimeZone11.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withZone(dateTimeZone11);
        java.lang.Integer int18 = dateTimeFormatter17.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.halfdays();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        byte byte0 = org.joda.time.DateTimeFieldType.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 12 + "'", byte0 == (byte) 12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        org.joda.time.DurationField durationField12 = zeroIsMaxDateTimeField9.getRangeDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(60, (int) (byte) 14, (int) (byte) 16, 0, (int) '4', (int) (byte) 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology8.secondOfMinute();
        boolean boolean14 = dateTimeField12.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField17 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField12, dateTimeFieldType15);
        long long19 = zeroIsMaxDateTimeField17.roundFloor((long) 100);
        long long22 = zeroIsMaxDateTimeField17.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = zeroIsMaxDateTimeField17.getAsText(readablePartial23, (int) (short) -1, locale25);
        int int28 = zeroIsMaxDateTimeField17.getLeapAmount((-99979L));
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology29.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField37 = new org.joda.time.field.OffsetDateTimeField(dateTimeField32, dateTimeFieldType33, (int) (byte) 7, 3, 0);
        int int38 = offsetDateTimeField37.getMaximumValue();
        int int40 = offsetDateTimeField37.getMaximumValue((-99979L));
        int int43 = offsetDateTimeField37.getDifference(12L, (long) '4');
        java.lang.Object obj44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(obj44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay48 = dateTime47.toTimeOfDay();
        boolean boolean49 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay48);
        org.joda.time.chrono.GregorianChronology gregorianChronology50 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology50.monthOfYear();
        org.joda.time.DurationField durationField53 = gregorianChronology50.hours();
        org.joda.time.DateTimeField dateTimeField54 = gregorianChronology50.secondOfMinute();
        boolean boolean56 = dateTimeField54.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str58 = dateTimeFieldType57.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField59 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField54, dateTimeFieldType57);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology61 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gregorianChronology61.dayOfYear();
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology61.monthOfYear();
        org.joda.time.DurationField durationField64 = gregorianChronology61.hours();
        org.joda.time.DateTimeField dateTimeField65 = gregorianChronology61.secondOfMinute();
        boolean boolean67 = dateTimeField65.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str69 = dateTimeFieldType68.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField70 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField65, dateTimeFieldType68);
        long long72 = zeroIsMaxDateTimeField70.roundFloor((long) 100);
        long long74 = zeroIsMaxDateTimeField70.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial75 = null;
        java.util.Locale locale77 = null;
        java.lang.String str78 = zeroIsMaxDateTimeField70.getAsText(readablePartial75, (int) (byte) 7, locale77);
        int int79 = zeroIsMaxDateTimeField70.getMinimumValue();
        int int82 = zeroIsMaxDateTimeField70.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial83 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology84 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField85 = gregorianChronology84.dayOfYear();
        org.joda.time.DateTimeField dateTimeField86 = gregorianChronology84.monthOfYear();
        org.joda.time.ReadablePartial readablePartial87 = null;
        int[] intArray88 = new int[] {};
        int int89 = dateTimeField86.getMaximumValue(readablePartial87, intArray88);
        int int90 = zeroIsMaxDateTimeField70.getMinimumValue(readablePartial83, intArray88);
        int int91 = dateTimeField54.getMinimumValue(readablePartial60, intArray88);
        int int92 = offsetDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay48, intArray88);
        int int93 = zeroIsMaxDateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay48);
        int[] intArray95 = chronology6.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) 100);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "centuryOfEra" + "'", str16, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1" + "'", str26, "-1");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(gregorianChronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "centuryOfEra" + "'", str58, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "centuryOfEra" + "'", str69, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 999L + "'", long74 == 999L);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "7" + "'", str78, "7");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 12 + "'", int89 == 12);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 8 + "'", int92 == 8);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[0, 0, 0, 99]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology3 = gregorianChronology0.withUTC();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        boolean boolean12 = unsupportedDurationField10.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getDifferenceAsLong((long) 256000, 32001L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.dayOfMonth();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTimeZone dateTimeZone2 = dateTime1.getZone();
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 1);
        boolean boolean7 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = gregorianChronology8.weeks();
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = dateTime4.equals((java.lang.Object) gregorianChronology8);
        int int12 = dateTime4.getSecondOfMinute();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField16 = gregorianChronology13.hours();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology13.secondOfMinute();
        boolean boolean19 = dateTimeField17.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField22 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField17, dateTimeFieldType20);
        long long24 = zeroIsMaxDateTimeField22.roundFloor((long) 100);
        boolean boolean25 = zeroIsMaxDateTimeField22.isSupported();
        boolean boolean26 = dateTime4.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "centuryOfEra" + "'", str21, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.Appendable appendable1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        org.joda.time.DurationField durationField5 = gregorianChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology2.secondOfMinute();
        boolean boolean8 = dateTimeField6.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str10 = dateTimeFieldType9.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField11 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField6, dateTimeFieldType9);
        long long13 = zeroIsMaxDateTimeField11.roundFloor((long) 100);
        long long16 = zeroIsMaxDateTimeField11.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale19 = null;
        java.lang.String str20 = zeroIsMaxDateTimeField11.getAsText(readablePartial17, (int) (short) -1, locale19);
        int int22 = zeroIsMaxDateTimeField11.getLeapAmount((-99979L));
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField31 = new org.joda.time.field.OffsetDateTimeField(dateTimeField26, dateTimeFieldType27, (int) (byte) 7, 3, 0);
        int int32 = offsetDateTimeField31.getMaximumValue();
        int int34 = offsetDateTimeField31.getMaximumValue((-99979L));
        int int37 = offsetDateTimeField31.getDifference(12L, (long) '4');
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay42 = dateTime41.toTimeOfDay();
        boolean boolean43 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay42);
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology44.monthOfYear();
        org.joda.time.DurationField durationField47 = gregorianChronology44.hours();
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology44.secondOfMinute();
        boolean boolean50 = dateTimeField48.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str52 = dateTimeFieldType51.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField53 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField48, dateTimeFieldType51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology55 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gregorianChronology55.dayOfYear();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology55.monthOfYear();
        org.joda.time.DurationField durationField58 = gregorianChronology55.hours();
        org.joda.time.DateTimeField dateTimeField59 = gregorianChronology55.secondOfMinute();
        boolean boolean61 = dateTimeField59.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str63 = dateTimeFieldType62.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField64 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField59, dateTimeFieldType62);
        long long66 = zeroIsMaxDateTimeField64.roundFloor((long) 100);
        long long68 = zeroIsMaxDateTimeField64.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial69 = null;
        java.util.Locale locale71 = null;
        java.lang.String str72 = zeroIsMaxDateTimeField64.getAsText(readablePartial69, (int) (byte) 7, locale71);
        int int73 = zeroIsMaxDateTimeField64.getMinimumValue();
        int int76 = zeroIsMaxDateTimeField64.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial77 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology78 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField79 = gregorianChronology78.dayOfYear();
        org.joda.time.DateTimeField dateTimeField80 = gregorianChronology78.monthOfYear();
        org.joda.time.ReadablePartial readablePartial81 = null;
        int[] intArray82 = new int[] {};
        int int83 = dateTimeField80.getMaximumValue(readablePartial81, intArray82);
        int int84 = zeroIsMaxDateTimeField64.getMinimumValue(readablePartial77, intArray82);
        int int85 = dateTimeField48.getMinimumValue(readablePartial54, intArray82);
        int int86 = offsetDateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay42, intArray82);
        int int87 = zeroIsMaxDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay42);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) timeOfDay42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "centuryOfEra" + "'", str10, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(gregorianChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "centuryOfEra" + "'", str52, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "centuryOfEra" + "'", str63, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 999L + "'", long68 == 999L);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "7" + "'", str72, "7");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 12 + "'", int83 == 12);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 1, (int) (byte) -1, 0, 4, (int) (short) 1, (int) (byte) 17, (int) (byte) 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology9 = gregorianChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone2.getOffset(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone10.isLocalDateTimeGap(localDateTime13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName(1712715987735L, locale16);
        long long19 = dateTimeZone2.getMillisKeepLocal(dateTimeZone10, (long) (byte) 100);
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.monthOfYear();
        org.joda.time.DurationField durationField23 = gregorianChronology20.hours();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology20.secondOfMinute();
        boolean boolean26 = dateTimeField24.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str28 = dateTimeFieldType27.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField29 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField24, dateTimeFieldType27);
        long long31 = zeroIsMaxDateTimeField29.roundFloor((long) 100);
        long long33 = zeroIsMaxDateTimeField29.remainder((long) (byte) -1);
        long long35 = zeroIsMaxDateTimeField29.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology36.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology36.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology36.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField(dateTimeField39, dateTimeFieldType40, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException47 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType40, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField49 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField29, dateTimeFieldType40, (int) (byte) 19);
        long long52 = dividedDateTimeField49.addWrapField((-99994L), (int) (byte) 2);
        long long55 = dividedDateTimeField49.add(1L, (long) (byte) 14);
        org.joda.time.ReadablePartial readablePartial56 = null;
        int int57 = dividedDateTimeField49.getMinimumValue(readablePartial56);
        boolean boolean58 = dateTimeZone2.equals((java.lang.Object) readablePartial56);
        long long60 = dateTimeZone2.nextTransition((long) (byte) 8);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(gregorianChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "centuryOfEra" + "'", str28, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 999L + "'", long33 == 999L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-61994L) + "'", long52 == (-61994L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 266001L + "'", long55 == 266001L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 8L + "'", long60 == 8L);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        org.joda.time.DateTime.Property property11 = dateTime6.secondOfMinute();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        int int17 = dateTime15.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.PeriodType periodType21 = org.joda.time.DateTimeUtils.getPeriodType(periodType20);
        org.joda.time.Period period22 = readableInterval19.toPeriod(periodType21);
        org.joda.time.DateTime dateTime23 = dateTime15.minus((org.joda.time.ReadablePeriod) period22);
        int int24 = property11.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2024 + "'", int10 == 2024);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        boolean boolean12 = unsupportedDurationField10.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getDifferenceAsLong(14400000L, 54000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(60, 0, 60, 99, (int) 'a', dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.remainder((long) 1);
        long long17 = zeroIsMaxDateTimeField9.roundCeiling(1712715991341L);
        long long20 = zeroIsMaxDateTimeField9.add((long) (byte) 5, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField((org.joda.time.Chronology) gregorianChronology23);
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology23);
        int int27 = dateTime26.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime29 = dateTime26.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property31 = dateTime29.property(dateTimeFieldType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType30, (int) (byte) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712715992000L + "'", long17 == 1712715992000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97005L + "'", long20 == 97005L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology0.getDateTimeMillis((int) (byte) 23, 18981, 54, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for millisOfDay must be in the range [0,86400000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        long long12 = unsupportedDurationField10.getUnitMillis();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.DateTime dateTime17 = dateTime14.withFieldAdded(durationFieldType15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DecoratedDurationField decoratedDurationField18 = new org.joda.time.field.DecoratedDurationField((org.joda.time.DurationField) unsupportedDurationField10, durationFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must be supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundFloor((long) (byte) 1);
        int int17 = zeroIsMaxDateTimeField9.getMinimumValue(0L);
        int int18 = zeroIsMaxDateTimeField9.getMinimumValue();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        java.util.Locale locale20 = null;
        java.lang.String str21 = zeroIsMaxDateTimeField9.getAsText(12, locale20);
        java.util.Locale locale22 = null;
        int int23 = zeroIsMaxDateTimeField9.getMaximumTextLength(locale22);
        long long26 = zeroIsMaxDateTimeField9.add((long) (byte) 16, 4);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12" + "'", str21, "12");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 4016L + "'", long26 == 4016L);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.days();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gregorianChronology1.getDateTimeMillis(9, 99, (int) (byte) 4, (int) (short) 1, (int) 'a', 0, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = gregorianChronology6.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) '#', 20, (-1), (int) (byte) 17, (int) (byte) 0, 0, (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.days();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter2.parseMutableDateTime("-1");
        boolean boolean5 = gregorianChronology0.equals((java.lang.Object) dateTimeFormatter2);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.lang.String str2 = dateTimeFormatter0.print((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter0.parseDateTime("DateTimeField[era]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[era]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-365" + "'", str2, "1969-365");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.toString();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField9.set((long) (byte) 21, "58", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnsupportedDateTimeField" + "'", str11, "UnsupportedDateTimeField");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 14, 70000, (int) (byte) -1, 26, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getShortName((long) '#', locale10);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.monthOfYear();
        org.joda.time.DurationField durationField15 = gregorianChronology12.hours();
        boolean boolean16 = dateTimeZone8.equals((java.lang.Object) gregorianChronology12);
        java.lang.String str18 = dateTimeZone8.getNameKey((-1L));
        long long22 = dateTimeZone8.convertLocalToUTC(12L, false, 54000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(99, 1, (-100), (int) (byte) 4, (int) (byte) 9, 19, 1969, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 13L + "'", long22 == 13L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime6.plusSeconds(100);
        boolean boolean14 = dateTime12.isAfter((long) 60);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2024 + "'", int10 == 2024);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, (int) (short) 10, (-100), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for centuryOfEra must be in the range [-100,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        long long12 = unsupportedDurationField10.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getValueAsLong(1008L, 266001L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unsupportedDurationField10.getValue(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        int int5 = dateTime4.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2024 + "'", int2 == 2024);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        byte byte0 = org.joda.time.DurationFieldType.WEEKYEARS;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 3 + "'", byte0 == (byte) 3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundHalfCeiling((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = offsetDateTimeField8.add((long) (byte) 7, 1712716001910L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1712716001910");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime5.minusDays((int) (byte) 15);
        int int11 = dateTime10.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, 1712629604846L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        int int8 = dateTimeField4.getMinimumValue((long) 8);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.joda.time.DateTimeUtils.SystemMillisProvider systemMillisProvider0 = new org.joda.time.DateTimeUtils.SystemMillisProvider();
        long long1 = systemMillisProvider0.getMillis();
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1712716010216L + "'", long1 == 1712716010216L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField9.addWrapField((long) (byte) 21, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.halfdayOfDay();
        long long4 = dateTimeField1.add(0L, 12);
        java.util.Locale locale5 = null;
        int int6 = dateTimeField1.getMaximumTextLength(locale5);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 518400000L + "'", long4 == 518400000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.clockhourOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology2.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField9, dateTimeFieldType10, (int) (byte) 7, 3, 0);
        int int15 = offsetDateTimeField14.getMaximumValue();
        int int17 = offsetDateTimeField14.getMaximumValue((-99979L));
        int int20 = offsetDateTimeField14.getDifference(12L, (long) '4');
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay25 = dateTime24.toTimeOfDay();
        boolean boolean26 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay25);
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.monthOfYear();
        org.joda.time.DurationField durationField30 = gregorianChronology27.hours();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology27.secondOfMinute();
        boolean boolean33 = dateTimeField31.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str35 = dateTimeFieldType34.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField36 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField31, dateTimeFieldType34);
        org.joda.time.ReadablePartial readablePartial37 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology38.monthOfYear();
        org.joda.time.DurationField durationField41 = gregorianChronology38.hours();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology38.secondOfMinute();
        boolean boolean44 = dateTimeField42.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str46 = dateTimeFieldType45.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField47 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField42, dateTimeFieldType45);
        long long49 = zeroIsMaxDateTimeField47.roundFloor((long) 100);
        long long51 = zeroIsMaxDateTimeField47.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale54 = null;
        java.lang.String str55 = zeroIsMaxDateTimeField47.getAsText(readablePartial52, (int) (byte) 7, locale54);
        int int56 = zeroIsMaxDateTimeField47.getMinimumValue();
        int int59 = zeroIsMaxDateTimeField47.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology61 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gregorianChronology61.dayOfYear();
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology61.monthOfYear();
        org.joda.time.ReadablePartial readablePartial64 = null;
        int[] intArray65 = new int[] {};
        int int66 = dateTimeField63.getMaximumValue(readablePartial64, intArray65);
        int int67 = zeroIsMaxDateTimeField47.getMinimumValue(readablePartial60, intArray65);
        int int68 = dateTimeField31.getMinimumValue(readablePartial37, intArray65);
        int int69 = offsetDateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay25, intArray65);
        int int70 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay25);
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = dateTimeField1.getAsShortText((org.joda.time.ReadablePartial) timeOfDay25, locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "centuryOfEra" + "'", str35, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "centuryOfEra" + "'", str46, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 999L + "'", long51 == 999L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "7" + "'", str55, "7");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 12 + "'", int66 == 12);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 8 + "'", int69 == 8);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.dayOfWeek();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = gregorianChronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.secondOfMinute();
        boolean boolean13 = dateTimeField11.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField16 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField11, dateTimeFieldType14);
        java.lang.String str18 = zeroIsMaxDateTimeField16.getAsShortText((long) (short) 1);
        int int20 = zeroIsMaxDateTimeField16.get(1012L);
        boolean boolean21 = gregorianChronology0.equals((java.lang.Object) zeroIsMaxDateTimeField16);
        long long23 = zeroIsMaxDateTimeField16.roundHalfFloor((long) (byte) 17);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "centuryOfEra" + "'", str15, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "60" + "'", str18, "60");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTimeNoMillis();
        java.lang.String str2 = dateTimeFormatter0.print(1L);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter0.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "160000-0800" + "'", str2, "160000-0800");
        org.junit.Assert.assertNotNull(dateTimeParser3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDurationField10.getValueAsLong((-90142950L), 97005L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.toString();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDateTimeField9.getMaximumShortTextLength(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnsupportedDateTimeField" + "'", str11, "UnsupportedDateTimeField");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        long long38 = durationField36.getValueAsLong(25200022L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1326L + "'", long38 == 1326L);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        int int6 = durationField3.getValue((long) '#', (long) 54);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.joda.time.DateTimeUtils.FixedMillisProvider fixedMillisProvider1 = new org.joda.time.DateTimeUtils.FixedMillisProvider((long) (byte) -1);
        org.joda.time.DateTimeUtils.setCurrentMillisProvider((org.joda.time.DateTimeUtils.MillisProvider) fixedMillisProvider1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        long long12 = unsupportedDurationField10.getUnitMillis();
        boolean boolean13 = unsupportedDurationField10.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getMillis(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(durationFieldType0, (java.lang.Number) (byte) 0, number2, (java.lang.Number) 1712716001910L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField9.roundHalfEven(9001L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = unsupportedDateTimeField9.set(97000L, "UnsupportedDateTimeField", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.days();
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = gregorianChronology9.hours();
        boolean boolean11 = org.joda.time.field.FieldUtils.equals((java.lang.Object) durationField8, (java.lang.Object) gregorianChronology9);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology9.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = unsupportedDateTimeField9.roundHalfCeiling((long) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.era();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (-99994L));
        int int5 = preciseDurationField2.getValue((long) 1, (long) (byte) 8);
        long long8 = preciseDurationField2.getMillis(2024, 0L);
        org.joda.time.DurationFieldType durationFieldType9 = preciseDurationField2.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-202387856L) + "'", long8 == (-202387856L));
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay16 = dateTime15.toTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = unsupportedDateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay16);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, 1712716004843L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.CENTURIES_TYPE;
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.ReadablePartial readablePartial36 = null;
        int int37 = dividedDateTimeField29.getMinimumValue(readablePartial36);
        int int38 = dividedDateTimeField29.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.IllegalFieldValueException illegalFieldValueException43 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType39, (java.lang.Number) (byte) 11, (java.lang.Number) (short) 0, (java.lang.Number) (short) 100);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField44 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField29, dateTimeFieldType39);
        long long46 = remainderDateTimeField44.roundHalfEven(70005003L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 70005000L + "'", long46 == 70005000L);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unsupportedDateTimeField9.getMinimumValue((long) (byte) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        long long13 = unsupportedDateTimeField9.add((long) 18, (long) (byte) 14);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unsupportedDateTimeField9.getLeapAmount((-61994L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 8467200018L + "'", long13 == 8467200018L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = gregorianChronology11.hours();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology11.secondOfMinute();
        boolean boolean17 = dateTimeField15.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str19 = dateTimeFieldType18.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField20 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField15, dateTimeFieldType18);
        long long22 = zeroIsMaxDateTimeField20.roundFloor((long) 100);
        long long24 = zeroIsMaxDateTimeField20.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale27 = null;
        java.lang.String str28 = zeroIsMaxDateTimeField20.getAsText(readablePartial25, (int) (byte) 7, locale27);
        int int29 = zeroIsMaxDateTimeField20.getMinimumValue();
        int int32 = zeroIsMaxDateTimeField20.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial33 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology34.dayOfYear();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology34.monthOfYear();
        org.joda.time.ReadablePartial readablePartial37 = null;
        int[] intArray38 = new int[] {};
        int int39 = dateTimeField36.getMaximumValue(readablePartial37, intArray38);
        int int40 = zeroIsMaxDateTimeField20.getMinimumValue(readablePartial33, intArray38);
        int int41 = dateTimeField4.getMinimumValue(readablePartial10, intArray38);
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField4, 18, 0, (int) 'a');
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "centuryOfEra" + "'", str19, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 999L + "'", long24 == 999L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "7" + "'", str28, "7");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12 + "'", int39 == 12);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.remainder((long) 1);
        long long17 = zeroIsMaxDateTimeField9.roundCeiling(1712715991341L);
        long long20 = zeroIsMaxDateTimeField9.add((long) (byte) 5, (int) 'a');
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay25 = dateTime24.toTimeOfDay();
        boolean boolean26 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay25);
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = zeroIsMaxDateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay25, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712715992000L + "'", long17 == 1712715992000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97005L + "'", long20 == 97005L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = dateTimeFormatter0.parseLocalDate("1970-10-31T05:00:00.999-08:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-10-31T05:00:00.999-08:00\" is malformed at \"-10-31T05:00:00.999-08:00\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        int int6 = dateTime4.getSecondOfDay();
        int int7 = dateTime4.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 57599 + "'", int6 == 57599);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (long) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = dateTimeField5.getLeapDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = gregorianChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.centuryOfEra();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay16 = dateTime15.toTimeOfDay();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) timeOfDay16, 99, locale18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone22.isLocalDateTimeGap(localDateTime25);
        java.lang.String str27 = dateTimeZone22.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone22, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.DateTimeUtils.getPeriodType(periodType32);
        org.joda.time.Period period34 = readableInterval31.toPeriod(periodType33);
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.DateTimeUtils.getPeriodType(periodType37);
        org.joda.time.Period period39 = readableInterval36.toPeriod(periodType38);
        org.joda.time.Period period40 = readableInterval31.toPeriod(periodType38);
        int[] intArray43 = gregorianChronology29.get((org.joda.time.ReadablePeriod) period40, (long) 100, (-202387856L));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = dateTimeField5.addWrapField((org.joda.time.ReadablePartial) timeOfDay16, 2000, intArray43, 256000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "99" + "'", str19, "99");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, -2, -8, -13, -7, -956]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField((org.joda.time.Chronology) gregorianChronology12);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology12);
        int int16 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime19 = dateTime18.toLocalTime();
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localTime19, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) '#', locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withZone(dateTimeZone11);
        java.lang.String str16 = dateTimeZone11.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter7.withZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter7.withZone(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime6.toMutableDateTime();
        int int12 = mutableDateTime11.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long12 = zeroIsMaxDateTimeField9.add(12L, (long) (byte) 1);
        org.joda.time.DurationField durationField13 = zeroIsMaxDateTimeField9.getDurationField();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = zeroIsMaxDateTimeField9.getMaximumValue(readablePartial14);
        int int16 = zeroIsMaxDateTimeField9.getMaximumValue();
        long long19 = zeroIsMaxDateTimeField9.addWrapField(8L, (int) (byte) 23);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1012L + "'", long12 == 1012L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 23008L + "'", long19 == 23008L);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        java.lang.String str6 = dateTime4.toString("-00:00:00.001");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int8 = dateTime4.get(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999 + "'", int8 == 999);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        int int39 = durationField36.getDifference(1712716001828L, (long) (byte) -1);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 90142947 + "'", int39 == 90142947);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.DateTime dateTime4 = dateTime1.minusMonths((int) (byte) 1);
        int int5 = dateTime4.getSecondOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57599 + "'", int5 == 57599);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.monthOfYear();
        org.joda.time.DurationField durationField13 = gregorianChronology10.hours();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology10.secondOfMinute();
        boolean boolean16 = dateTimeField14.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str18 = dateTimeFieldType17.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField19 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField14, dateTimeFieldType17);
        long long21 = zeroIsMaxDateTimeField19.roundFloor((long) 100);
        long long23 = zeroIsMaxDateTimeField19.remainder((long) (byte) -1);
        java.lang.String str25 = zeroIsMaxDateTimeField19.getAsShortText(0L);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str27 = iSOChronology26.toString();
        org.joda.time.Chronology chronology28 = iSOChronology26.withUTC();
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology29.monthOfYear();
        org.joda.time.DurationField durationField32 = gregorianChronology29.hours();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology29.secondOfMinute();
        boolean boolean35 = dateTimeField33.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str37 = dateTimeFieldType36.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField38 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField33, dateTimeFieldType36);
        long long40 = zeroIsMaxDateTimeField38.roundFloor((long) 100);
        long long42 = zeroIsMaxDateTimeField38.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial43 = null;
        java.util.Locale locale45 = null;
        java.lang.String str46 = zeroIsMaxDateTimeField38.getAsText(readablePartial43, (int) (byte) 7, locale45);
        int int47 = zeroIsMaxDateTimeField38.getMaximumValue();
        java.util.Locale locale49 = null;
        java.lang.String str50 = zeroIsMaxDateTimeField38.getAsText(12, locale49);
        long long53 = zeroIsMaxDateTimeField38.add(1L, (int) (byte) 9);
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay58 = dateTime57.toTimeOfDay();
        int int59 = zeroIsMaxDateTimeField38.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay58);
        long long61 = chronology28.set((org.joda.time.ReadablePartial) timeOfDay58, 0L);
        org.joda.time.chrono.GregorianChronology gregorianChronology62 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology62.dayOfYear();
        org.joda.time.DateTimeField dateTimeField64 = gregorianChronology62.monthOfYear();
        org.joda.time.DurationField durationField65 = gregorianChronology62.hours();
        org.joda.time.DateTimeField dateTimeField66 = gregorianChronology62.secondOfMinute();
        boolean boolean68 = dateTimeField66.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str70 = dateTimeFieldType69.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField71 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField66, dateTimeFieldType69);
        long long73 = zeroIsMaxDateTimeField71.roundFloor((long) 100);
        long long75 = zeroIsMaxDateTimeField71.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial76 = null;
        java.util.Locale locale78 = null;
        java.lang.String str79 = zeroIsMaxDateTimeField71.getAsText(readablePartial76, (int) (byte) 7, locale78);
        int int80 = zeroIsMaxDateTimeField71.getMinimumValue();
        int int83 = zeroIsMaxDateTimeField71.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial84 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology85 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField86 = gregorianChronology85.dayOfYear();
        org.joda.time.DateTimeField dateTimeField87 = gregorianChronology85.monthOfYear();
        org.joda.time.ReadablePartial readablePartial88 = null;
        int[] intArray89 = new int[] {};
        int int90 = dateTimeField87.getMaximumValue(readablePartial88, intArray89);
        int int91 = zeroIsMaxDateTimeField71.getMinimumValue(readablePartial84, intArray89);
        int int92 = zeroIsMaxDateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay58, intArray89);
        int[] intArray94 = null;
        java.util.Locale locale96 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray97 = unsupportedDateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay58, (int) (byte) 22, intArray94, "DateTimeField[centuryOfEra]", locale96);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "centuryOfEra" + "'", str18, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 999L + "'", long23 == 999L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "60" + "'", str25, "60");
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ISOChronology[UTC]" + "'", str27, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "centuryOfEra" + "'", str37, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 999L + "'", long42 == 999L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "7" + "'", str46, "7");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "12" + "'", str50, "12");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 9001L + "'", long53 == 9001L);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 60 + "'", int59 == 60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 57599999L + "'", long61 == 57599999L);
        org.junit.Assert.assertNotNull(gregorianChronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "centuryOfEra" + "'", str70, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 999L + "'", long75 == 999L);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "7" + "'", str79, "7");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 12 + "'", int90 == 12);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 60 + "'", int92 == 60);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        java.lang.String str2 = dateTimeFormatter0.print((long) 70);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-W01" + "'", str2, "1970-W01");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime8.withYearOfCentury(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for yearOfCentury must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        java.lang.String str11 = zeroIsMaxDateTimeField9.getAsShortText((long) (short) 1);
        boolean boolean13 = zeroIsMaxDateTimeField9.isLeap((long) (byte) 11);
        int int16 = zeroIsMaxDateTimeField9.getDifference(100L, 0L);
        java.util.Locale locale17 = null;
        int int18 = zeroIsMaxDateTimeField9.getMaximumTextLength(locale17);
        boolean boolean20 = zeroIsMaxDateTimeField9.isLeap(4L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = zeroIsMaxDateTimeField9.getAsText((int) (byte) 11, locale22);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "60" + "'", str11, "60");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "11" + "'", str23, "11");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.DateTime dateTime4 = dateTime1.minusMonths((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        java.lang.Object obj12 = null;
        boolean boolean13 = org.joda.time.field.FieldUtils.equals((java.lang.Object) unsupportedDateTimeField9, obj12);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unsupportedDateTimeField9.getMaximumShortTextLength(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        long long12 = offsetDateTimeField8.roundHalfEven(25200022L);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = offsetDateTimeField8.add((long) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1977 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfDay();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        org.joda.time.DurationField durationField8 = gregorianChronology1.months();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int14 = offsetDateTimeField8.getDifference(12L, (long) '4');
        long long16 = offsetDateTimeField8.roundHalfFloor((long) (byte) 5);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        java.lang.String str9 = cachedDateTimeZone7.getNameKey((-99994L));
        long long11 = cachedDateTimeZone7.nextTransition((long) (byte) 21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 21L + "'", long11 == 21L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.time();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology3);
        int int7 = dateTime6.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime10 = dateTime9.toLocalTime();
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime10);
        int int12 = dateTimeFormatter0.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.017" + "'", str11, "00:00:00.017");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int14 = offsetDateTimeField8.getDifference(12L, (long) '4');
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay19 = dateTime18.toTimeOfDay();
        boolean boolean20 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay19);
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField24 = gregorianChronology21.hours();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology21.secondOfMinute();
        boolean boolean27 = dateTimeField25.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str29 = dateTimeFieldType28.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField30 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField25, dateTimeFieldType28);
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology32.monthOfYear();
        org.joda.time.DurationField durationField35 = gregorianChronology32.hours();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology32.secondOfMinute();
        boolean boolean38 = dateTimeField36.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str40 = dateTimeFieldType39.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField41 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField36, dateTimeFieldType39);
        long long43 = zeroIsMaxDateTimeField41.roundFloor((long) 100);
        long long45 = zeroIsMaxDateTimeField41.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale48 = null;
        java.lang.String str49 = zeroIsMaxDateTimeField41.getAsText(readablePartial46, (int) (byte) 7, locale48);
        int int50 = zeroIsMaxDateTimeField41.getMinimumValue();
        int int53 = zeroIsMaxDateTimeField41.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology55 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gregorianChronology55.dayOfYear();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology55.monthOfYear();
        org.joda.time.ReadablePartial readablePartial58 = null;
        int[] intArray59 = new int[] {};
        int int60 = dateTimeField57.getMaximumValue(readablePartial58, intArray59);
        int int61 = zeroIsMaxDateTimeField41.getMinimumValue(readablePartial54, intArray59);
        int int62 = dateTimeField25.getMinimumValue(readablePartial31, intArray59);
        int int63 = offsetDateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay19, intArray59);
        long long65 = offsetDateTimeField8.remainder(0L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "centuryOfEra" + "'", str29, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "centuryOfEra" + "'", str40, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 999L + "'", long45 == 999L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "7" + "'", str49, "7");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 12 + "'", int60 == 12);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 8 + "'", int63 == 8);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology9 = gregorianChronology0.withZone(dateTimeZone6);
        java.lang.String str11 = dateTimeZone6.getName(25200022L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long14 = zeroIsMaxDateTimeField9.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        int int16 = zeroIsMaxDateTimeField9.getMinimumValue(1712715996971L);
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = gregorianChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology17.secondOfMinute();
        boolean boolean23 = dateTimeField21.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str25 = dateTimeFieldType24.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField26 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField21, dateTimeFieldType24);
        long long28 = zeroIsMaxDateTimeField26.roundFloor((long) 100);
        long long30 = zeroIsMaxDateTimeField26.remainder((long) (byte) -1);
        long long32 = zeroIsMaxDateTimeField26.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology33 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology33.dayOfYear();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology33.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField41 = new org.joda.time.field.OffsetDateTimeField(dateTimeField36, dateTimeFieldType37, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException44 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType37, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField46 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField26, dateTimeFieldType37, (int) (byte) 19);
        long long49 = dividedDateTimeField46.addWrapField((-99994L), (int) (byte) 2);
        long long52 = dividedDateTimeField46.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField53 = dividedDateTimeField46.getDurationField();
        long long55 = dividedDateTimeField46.remainder((-61851226021989L));
        org.joda.time.chrono.GregorianChronology gregorianChronology56 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology56.dayOfYear();
        org.joda.time.DateTimeField dateTimeField58 = gregorianChronology56.monthOfYear();
        org.joda.time.DurationField durationField59 = gregorianChronology56.hours();
        org.joda.time.DateTimeField dateTimeField60 = gregorianChronology56.secondOfMinute();
        boolean boolean62 = dateTimeField60.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str64 = dateTimeFieldType63.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField65 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField60, dateTimeFieldType63);
        long long67 = zeroIsMaxDateTimeField65.roundFloor((long) 100);
        long long69 = zeroIsMaxDateTimeField65.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial70 = null;
        java.util.Locale locale72 = null;
        java.lang.String str73 = zeroIsMaxDateTimeField65.getAsText(readablePartial70, (int) (byte) 7, locale72);
        int int74 = zeroIsMaxDateTimeField65.getMaximumValue();
        java.util.Locale locale76 = null;
        java.lang.String str77 = zeroIsMaxDateTimeField65.getAsText(12, locale76);
        long long80 = zeroIsMaxDateTimeField65.add(1L, (int) (byte) 9);
        java.lang.Object obj81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime(obj81);
        org.joda.time.DateTime dateTime84 = dateTime82.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay85 = dateTime84.toTimeOfDay();
        int int86 = zeroIsMaxDateTimeField65.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay85);
        java.util.Locale locale88 = null;
        java.lang.String str89 = dividedDateTimeField46.getAsText((org.joda.time.ReadablePartial) timeOfDay85, (int) (short) 10, locale88);
        java.util.Locale locale90 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = zeroIsMaxDateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay85, locale90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "centuryOfEra" + "'", str25, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 999L + "'", long30 == 999L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-61994L) + "'", long49 == (-61994L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 266001L + "'", long52 == 266001L);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-61851226021989L) + "'", long55 == (-61851226021989L));
        org.junit.Assert.assertNotNull(gregorianChronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "centuryOfEra" + "'", str64, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 999L + "'", long69 == 999L);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "7" + "'", str73, "7");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 60 + "'", int74 == 60);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "12" + "'", str77, "12");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 9001L + "'", long80 == 9001L);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(timeOfDay85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 60 + "'", int86 == 60);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "10" + "'", str89, "10");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = gregorianChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology17.secondOfMinute();
        boolean boolean23 = dateTimeField21.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str25 = dateTimeFieldType24.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField26 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField21, dateTimeFieldType24);
        long long28 = zeroIsMaxDateTimeField26.roundFloor((long) 100);
        long long30 = zeroIsMaxDateTimeField26.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = zeroIsMaxDateTimeField26.getAsText(readablePartial31, (int) (byte) 7, locale33);
        int int35 = zeroIsMaxDateTimeField26.getMinimumValue();
        int int38 = zeroIsMaxDateTimeField26.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.monthOfYear();
        org.joda.time.ReadablePartial readablePartial43 = null;
        int[] intArray44 = new int[] {};
        int int45 = dateTimeField42.getMaximumValue(readablePartial43, intArray44);
        int int46 = zeroIsMaxDateTimeField26.getMinimumValue(readablePartial39, intArray44);
        int int47 = zeroIsMaxDateTimeField9.getMinimumValue(readablePartial16, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = zeroIsMaxDateTimeField9.set((long) 57599, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for centuryOfEra must be in the range [1,60]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "centuryOfEra" + "'", str25, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 999L + "'", long30 == 999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "7" + "'", str34, "7");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        org.joda.time.DurationFieldType durationFieldType12 = unsupportedDurationField10.getType();
        boolean boolean13 = unsupportedDurationField10.isSupported();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        org.joda.time.DurationField durationField19 = zeroIsMaxDateTimeField9.getRangeDurationField();
        int int20 = zeroIsMaxDateTimeField9.getMaximumValue();
        long long22 = zeroIsMaxDateTimeField9.roundHalfCeiling((long) 9);
        long long25 = zeroIsMaxDateTimeField9.addWrapField((long) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10001L + "'", long25 == 10001L);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        java.lang.String str15 = zeroIsMaxDateTimeField9.getAsShortText(0L);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str17 = iSOChronology16.toString();
        org.joda.time.Chronology chronology18 = iSOChronology16.withUTC();
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology19.monthOfYear();
        org.joda.time.DurationField durationField22 = gregorianChronology19.hours();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology19.secondOfMinute();
        boolean boolean25 = dateTimeField23.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str27 = dateTimeFieldType26.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField28 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField23, dateTimeFieldType26);
        long long30 = zeroIsMaxDateTimeField28.roundFloor((long) 100);
        long long32 = zeroIsMaxDateTimeField28.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = null;
        java.lang.String str36 = zeroIsMaxDateTimeField28.getAsText(readablePartial33, (int) (byte) 7, locale35);
        int int37 = zeroIsMaxDateTimeField28.getMaximumValue();
        java.util.Locale locale39 = null;
        java.lang.String str40 = zeroIsMaxDateTimeField28.getAsText(12, locale39);
        long long43 = zeroIsMaxDateTimeField28.add(1L, (int) (byte) 9);
        java.lang.Object obj44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(obj44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay48 = dateTime47.toTimeOfDay();
        int int49 = zeroIsMaxDateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay48);
        long long51 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay48, 0L);
        org.joda.time.chrono.GregorianChronology gregorianChronology52 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField53 = gregorianChronology52.dayOfYear();
        org.joda.time.DateTimeField dateTimeField54 = gregorianChronology52.monthOfYear();
        org.joda.time.DurationField durationField55 = gregorianChronology52.hours();
        org.joda.time.DateTimeField dateTimeField56 = gregorianChronology52.secondOfMinute();
        boolean boolean58 = dateTimeField56.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str60 = dateTimeFieldType59.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField61 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField56, dateTimeFieldType59);
        long long63 = zeroIsMaxDateTimeField61.roundFloor((long) 100);
        long long65 = zeroIsMaxDateTimeField61.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial66 = null;
        java.util.Locale locale68 = null;
        java.lang.String str69 = zeroIsMaxDateTimeField61.getAsText(readablePartial66, (int) (byte) 7, locale68);
        int int70 = zeroIsMaxDateTimeField61.getMinimumValue();
        int int73 = zeroIsMaxDateTimeField61.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial74 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology75 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField76 = gregorianChronology75.dayOfYear();
        org.joda.time.DateTimeField dateTimeField77 = gregorianChronology75.monthOfYear();
        org.joda.time.ReadablePartial readablePartial78 = null;
        int[] intArray79 = new int[] {};
        int int80 = dateTimeField77.getMaximumValue(readablePartial78, intArray79);
        int int81 = zeroIsMaxDateTimeField61.getMinimumValue(readablePartial74, intArray79);
        int int82 = zeroIsMaxDateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay48, intArray79);
        long long85 = zeroIsMaxDateTimeField9.set(1712715996971L, (int) (byte) 19);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "60" + "'", str15, "60");
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[UTC]" + "'", str17, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "centuryOfEra" + "'", str27, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 999L + "'", long32 == 999L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "7" + "'", str36, "7");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "12" + "'", str40, "12");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9001L + "'", long43 == 9001L);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 57599999L + "'", long51 == 57599999L);
        org.junit.Assert.assertNotNull(gregorianChronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "centuryOfEra" + "'", str60, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 999L + "'", long65 == 999L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "7" + "'", str69, "7");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 12 + "'", int80 == 12);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 60 + "'", int82 == 60);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1712715979971L + "'", long85 == 1712715979971L);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "era" + "'", str1, "era");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology0.days();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology0.getDateTimeMillis((int) (byte) 17, (int) (byte) -1, (int) (short) 1, 70000, 1969, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        boolean boolean10 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime9.getYearOfEra();
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.joda.time.DurationField durationField13 = property12.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        int int1 = org.joda.time.format.FormatUtils.calculateDigitCount((long) 48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (byte) 1);
        int int11 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology14);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.hourOfDay();
        org.joda.time.DurationField durationField24 = gregorianChronology21.days();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology21.minuteOfDay();
        org.joda.time.DateTime dateTime26 = dateTime17.withChronology((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime((org.joda.time.Chronology) gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.hourOfDay();
        org.joda.time.DurationField durationField10 = gregorianChronology7.days();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.minuteOfDay();
        int int12 = gregorianChronology7.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (byte) 4, 0, 2, 365, 365, 1969, 0, (org.joda.time.Chronology) gregorianChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        boolean boolean10 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime9.getDayOfWeek();
        int int12 = dateTime9.getMinuteOfHour();
        boolean boolean14 = dateTime9.isAfter((long) (byte) 9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        org.joda.time.DurationField durationField19 = zeroIsMaxDateTimeField9.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = zeroIsMaxDateTimeField9.getType();
        java.util.Locale locale23 = null;
        long long24 = zeroIsMaxDateTimeField9.set(0L, "12", locale23);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 12000L + "'", long24 == 12000L);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonthDay();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone3 = gregorianChronology0.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.hours();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology4.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology13 = gregorianChronology4.withZone(dateTimeZone10);
        boolean boolean14 = dateTimeZone10.isFixed();
        org.joda.time.Chronology chronology15 = gregorianChronology0.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology16 = gregorianChronology0.withUTC();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = gregorianChronology0.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter1.parseMutableDateTime("-1");
        int int6 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "", (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter11.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser12);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeParser12);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField2 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 365, 70, (int) (short) 10, (int) (byte) 12, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology9 = gregorianChronology0.withZone(dateTimeZone6);
        boolean boolean10 = dateTimeZone6.isFixed();
        int int12 = dateTimeZone6.getOffset(20000L);
        java.lang.String str14 = dateTimeZone6.getShortName((long) (-100));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        java.lang.String str2 = dateTimeFormatter0.print((long) 100);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-W01-3" + "'", str2, "1970-W01-3");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.getDifferenceAsLong((-61994L), 1712716001828L);
        long long38 = dividedDateTimeField29.getDifferenceAsLong((long) 54, 10001L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-90142950L) + "'", long35 == (-90142950L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZone(dateTimeZone3);
        java.lang.String str8 = dateTimeZone3.toString();
        java.lang.String str10 = dateTimeZone3.getNameKey(1326L);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.remainder((long) 1);
        long long18 = zeroIsMaxDateTimeField9.addWrapField(1712716003015L, 19);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1712715962015L + "'", long18 == 1712715962015L);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (long) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology9.hourOfDay();
        org.joda.time.DurationField durationField12 = gregorianChronology9.days();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime5.withChronology((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology9.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("60");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("11");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        int int11 = zeroIsMaxDateTimeField9.getMinimumValue((long) (byte) 100);
        java.lang.String str13 = zeroIsMaxDateTimeField9.getAsText((long) (byte) 18);
        java.util.Locale locale15 = null;
        java.lang.String str16 = zeroIsMaxDateTimeField9.getAsShortText((long) (byte) 0, locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField18 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrapped field's minumum value must be zero");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "60" + "'", str13, "60");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "60" + "'", str16, "60");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unsupportedDateTimeField9.isLeap(8467200018L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = dateTime14.toLocalDateTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = gregorianChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology17.secondOfMinute();
        boolean boolean23 = dateTimeField21.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str25 = dateTimeFieldType24.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField26 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField21, dateTimeFieldType24);
        long long28 = zeroIsMaxDateTimeField26.roundFloor((long) 100);
        long long30 = zeroIsMaxDateTimeField26.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = zeroIsMaxDateTimeField26.getAsText(readablePartial31, (int) (byte) 7, locale33);
        int int35 = zeroIsMaxDateTimeField26.getMinimumValue();
        int int38 = zeroIsMaxDateTimeField26.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.monthOfYear();
        org.joda.time.ReadablePartial readablePartial43 = null;
        int[] intArray44 = new int[] {};
        int int45 = dateTimeField42.getMaximumValue(readablePartial43, intArray44);
        int int46 = zeroIsMaxDateTimeField26.getMinimumValue(readablePartial39, intArray44);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = offsetDateTimeField8.set((org.joda.time.ReadablePartial) localDateTime15, (int) (byte) 14, intArray44, (int) (byte) 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "centuryOfEra" + "'", str25, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 999L + "'", long30 == 999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "7" + "'", str34, "7");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        boolean boolean9 = readableInterval6.isAfter(readableInterval7);
        boolean boolean10 = readableInterval1.contains(readableInterval7);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime14.minusDays(200);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        boolean boolean22 = readableInterval1.isAfter((org.joda.time.ReadableInstant) dateTime21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime21.withMinuteOfHour(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        boolean boolean12 = unsupportedDurationField10.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unsupportedDurationField10.getValue((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = readableInterval1.getChronology();
        org.joda.time.Interval interval6 = readableInterval1.toInterval();
        java.lang.String str7 = readableInterval1.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology8.secondOfMinute();
        boolean boolean14 = dateTimeField12.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField17 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField12, dateTimeFieldType15);
        long long19 = zeroIsMaxDateTimeField17.roundFloor((long) 100);
        long long21 = zeroIsMaxDateTimeField17.remainder((long) (byte) -1);
        long long23 = zeroIsMaxDateTimeField17.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology24.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField(dateTimeField27, dateTimeFieldType28, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException35 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType28, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField17, dateTimeFieldType28, (int) (byte) 19);
        long long40 = dividedDateTimeField37.addWrapField((-99994L), (int) (byte) 2);
        long long43 = dividedDateTimeField37.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField44 = dividedDateTimeField37.getDurationField();
        boolean boolean45 = durationField44.isSupported();
        boolean boolean46 = readableInterval1.equals((java.lang.Object) durationField44);
        long long47 = readableInterval1.toDurationMillis();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31T15:59:59.999/1969-12-31T15:59:59.999" + "'", str7, "1969-12-31T15:59:59.999/1969-12-31T15:59:59.999");
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "centuryOfEra" + "'", str16, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 999L + "'", long21 == 999L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-61994L) + "'", long40 == (-61994L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 266001L + "'", long43 == 266001L);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology0.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType4, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        java.lang.Number number12 = illegalFieldValueException11.getLowerBound();
        java.lang.String str13 = illegalFieldValueException11.toString();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.joda.time.IllegalFieldValueException: Value 1712715991341 for era is not supported: GregorianChronology[UTC]" + "'", str13, "org.joda.time.IllegalFieldValueException: Value 1712715991341 for era is not supported: GregorianChronology[UTC]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.remainder((long) 1);
        java.util.Locale locale16 = null;
        int int17 = zeroIsMaxDateTimeField9.getMaximumTextLength(locale16);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.remainder((long) 1);
        java.util.Locale locale18 = null;
        long long19 = zeroIsMaxDateTimeField9.set((-62111231999995L), "7", locale18);
        boolean boolean20 = zeroIsMaxDateTimeField9.isSupported();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62111231992995L) + "'", long19 == (-62111231992995L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) (byte) 2);
        long long11 = dateTimeZone7.previousTransition(1712715987735L);
        org.joda.time.Chronology chronology12 = gregorianChronology1.withZone(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1712715987735L + "'", long11 == 1712715987735L);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        java.lang.String str3 = dateTimeFieldType0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 5, 70, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5 for yearOfCentury must be in the range [70,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yearOfCentury" + "'", str3, "yearOfCentury");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("-00:00:00.001", 200);
        java.io.DataOutput dataOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeZoneBuilder3.writeTo("millis", dataOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime8 = dateTime5.withHourOfDay((int) (byte) 5);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateMidnight dateMidnight10 = dateTime8.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int12 = dateMidnight10.get(dateTimeFieldType11);
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType11, 26, (int) (byte) -1, 59);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-10-31T05:00:00.999-08:00" + "'", str9, "1970-10-31T05:00:00.999-08:00");
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hour();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField((org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.DurationField durationField19 = gregorianChronology17.weeks();
        boolean boolean20 = gregorianChronology12.equals((java.lang.Object) durationField19);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType9, durationField19);
        int int22 = dateTime5.get(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime5.getZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 70 + "'", int22 == 70);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology9 = gregorianChronology0.withZone(dateTimeZone6);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusSeconds((int) (byte) 1);
        boolean boolean17 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = gregorianChronology18.weeks();
        org.joda.time.DurationField durationField20 = gregorianChronology18.weeks();
        boolean boolean21 = dateTime14.equals((java.lang.Object) gregorianChronology18);
        int int22 = dateTime14.getYear();
        int int23 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1969 + "'", int22 == 1969);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType4, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        java.lang.String str12 = illegalFieldValueException11.toString();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.joda.time.IllegalFieldValueException: Value 1712715991341 for era is not supported: GregorianChronology[UTC]" + "'", str12, "org.joda.time.IllegalFieldValueException: Value 1712715991341 for era is not supported: GregorianChronology[UTC]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        boolean boolean5 = durationField4.isPrecise();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.joda.time.DateTimeUtils.OffsetMillisProvider offsetMillisProvider1 = new org.joda.time.DateTimeUtils.OffsetMillisProvider((long) 32);
        long long2 = offsetMillisProvider1.getMillis();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1712716017280L + "'", long2 == 1712716017280L);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str8 = iSOChronology7.toString();
        org.joda.time.Chronology chronology9 = iSOChronology7.withUTC();
        boolean boolean10 = dateTime5.equals((java.lang.Object) iSOChronology7);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.weekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        long long6 = gregorianChronology0.getDateTimeMillis((int) (byte) 1, 10, 10, (int) (byte) 5);
        java.lang.String str7 = gregorianChronology0.toString();
        org.joda.time.DurationField durationField8 = gregorianChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gregorianChronology0.getDateTimeMillis(12L, 10, (int) (byte) 22, 200, 69996);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 200 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62111231999995L) + "'", long6 == (-62111231999995L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GregorianChronology[UTC]" + "'", str7, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        java.lang.String str11 = dateTimeZone1.getNameKey((-1L));
        java.lang.String str13 = dateTimeZone1.getShortName((long) 8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.date();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        java.lang.Object obj12 = null;
        boolean boolean13 = org.joda.time.field.FieldUtils.equals((java.lang.Object) unsupportedDateTimeField9, obj12);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDateTimeField9.roundHalfEven((long) (byte) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1712629604846L);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        long long8 = dateTime6.getMillis();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-86399001L) + "'", long8 == (-86399001L));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundHalfCeiling((long) (byte) 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale14 = null;
        java.lang.String str15 = offsetDateTimeField8.getAsShortText(readablePartial12, (int) (short) 100, locale14);
        int int17 = offsetDateTimeField8.getLeapAmount(1712715996281L);
        long long19 = offsetDateTimeField8.roundCeiling((long) 59);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31536000000L + "'", long19 == 31536000000L);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 0, 19, 69996, (int) ' ', 256000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69996 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.DateTimeUtils.getPeriodType(periodType17);
        org.joda.time.Period period19 = readableInterval16.toPeriod(periodType18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.DateTimeUtils.getPeriodType(periodType22);
        org.joda.time.Period period24 = readableInterval21.toPeriod(periodType23);
        org.joda.time.Period period25 = readableInterval16.toPeriod(periodType23);
        int[] intArray28 = gregorianChronology14.get((org.joda.time.ReadablePeriod) period25, (long) 100, (-202387856L));
        int[] intArray30 = gregorianChronology0.get((org.joda.time.ReadablePeriod) period25, (long) 4);
        org.joda.time.DurationField durationField31 = gregorianChronology0.months();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 4]");
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.DateTimeUtils.getPeriodType(periodType17);
        org.joda.time.Period period19 = readableInterval16.toPeriod(periodType18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.DateTimeUtils.getPeriodType(periodType22);
        org.joda.time.Period period24 = readableInterval21.toPeriod(periodType23);
        org.joda.time.Period period25 = readableInterval16.toPeriod(periodType23);
        int[] intArray28 = gregorianChronology14.get((org.joda.time.ReadablePeriod) period25, (long) 100, (-202387856L));
        int[] intArray30 = gregorianChronology0.get((org.joda.time.ReadablePeriod) period25, (long) 4);
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 4]");
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime10.getZone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("1969-365", "1969-365");
        illegalFieldValueException2.prependMessage("1970-W01");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        long long12 = unsupportedDurationField10.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getDifferenceAsLong((long) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime7 = dateTime5.minusYears(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DurationField durationField11 = gregorianChronology9.weeks();
        org.joda.time.DurationField durationField12 = gregorianChronology9.days();
        org.joda.time.DateTime dateTime13 = dateTime7.withChronology((org.joda.time.Chronology) gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        int int12 = dateTime10.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withEra(2024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 364 + "'", int12 == 364);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField3 = gregorianChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology1.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology14 = gregorianChronology5.withZone(dateTimeZone11);
        boolean boolean15 = dateTimeZone11.isFixed();
        org.joda.time.Chronology chronology16 = gregorianChronology1.withZone(dateTimeZone11);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) 4016L, dateTimeZone11);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusSeconds((int) (byte) 1);
        int int29 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.minusYears(54);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTimeISO();
        boolean boolean33 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        int int9 = dateTime7.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
        org.joda.time.Period period14 = readableInterval11.toPeriod(periodType13);
        org.joda.time.DateTime dateTime15 = dateTime7.minus((org.joda.time.ReadablePeriod) period14);
        int[] intArray18 = gregorianChronology1.get((org.joda.time.ReadablePeriod) period14, 1712715992000L, (long) 99);
        org.joda.time.DurationField durationField19 = gregorianChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology1.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-54, -3, -1, -2, -2, -26, -31, -901]");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField9.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDateTimeField9.getLeapAmount(1712716010216L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gregorianChronology0.getDateTimeMillis((int) (byte) 12, 16, 9, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField16 = gregorianChronology13.hours();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology13.secondOfMinute();
        boolean boolean19 = dateTimeField17.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField22 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField17, dateTimeFieldType20);
        long long24 = zeroIsMaxDateTimeField22.roundFloor((long) 100);
        long long26 = zeroIsMaxDateTimeField22.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = null;
        java.lang.String str30 = zeroIsMaxDateTimeField22.getAsText(readablePartial27, (int) (byte) 7, locale29);
        int int31 = zeroIsMaxDateTimeField22.getMaximumValue();
        java.util.Locale locale33 = null;
        java.lang.String str34 = zeroIsMaxDateTimeField22.getAsText(12, locale33);
        long long37 = zeroIsMaxDateTimeField22.add(1L, (int) (byte) 9);
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay42 = dateTime41.toTimeOfDay();
        int int43 = zeroIsMaxDateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay42);
        java.util.Locale locale44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = unsupportedDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay42, locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "centuryOfEra" + "'", str21, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 999L + "'", long26 == 999L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "7" + "'", str30, "7");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "12" + "'", str34, "12");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9001L + "'", long37 == 9001L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZone(dateTimeZone3);
        long long9 = dateTimeFormatter0.parseMillis("1");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62135596800000L) + "'", long9 == (-62135596800000L));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay5 = dateTime4.toTimeOfDay();
        java.lang.String str6 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT155959.999" + "'", str6, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT155959.999");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        long long5 = durationField2.subtract((long) (short) -1, 10);
        boolean boolean6 = durationField2.isSupported();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-6048000001L) + "'", long5 == (-6048000001L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        org.joda.time.DateTime dateTime9 = property4.withMinimumValue();
        java.lang.String str10 = property4.getAsString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "69" + "'", str10, "69");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.year();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.DateTimeUtils.getPeriodType(periodType6);
        org.joda.time.Period period8 = readableInterval5.toPeriod(periodType7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.DateTimeUtils.getPeriodType(periodType11);
        org.joda.time.Period period13 = readableInterval10.toPeriod(periodType12);
        org.joda.time.Period period14 = readableInterval5.toPeriod(periodType12);
        int[] intArray17 = gregorianChronology0.get((org.joda.time.ReadablePeriod) period14, (long) 20, 97000L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 1, 36, 980]");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        int int31 = dividedDateTimeField29.getMaximumValue((long) 70);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = null;
        java.lang.String str17 = zeroIsMaxDateTimeField9.getAsText(readablePartial14, (int) (byte) 7, locale16);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue();
        java.util.Locale locale20 = null;
        java.lang.String str21 = zeroIsMaxDateTimeField9.getAsText(12, locale20);
        long long24 = zeroIsMaxDateTimeField9.add(1L, (int) (byte) 9);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay29 = dateTime28.toTimeOfDay();
        int int30 = zeroIsMaxDateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay29);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight35 = dateTime34.toDateMidnight();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        boolean boolean38 = dateTime37.isEqualNow();
        org.joda.time.LocalTime localTime39 = dateTime37.toLocalTime();
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localTime39, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7" + "'", str17, "7");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12" + "'", str21, "12");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9001L + "'", long24 == 9001L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime39);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("-00:00:00.001", 200);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder6 = dateTimeZoneBuilder3.setFixedSavings("58", 99);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeZoneBuilder3.toDateTimeZone("0", true);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder3.setStandardOffset(54);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter1.parseMutableDateTime("-1");
        int int6 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "", (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser9);
        java.io.Writer writer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(writer11, readablePartial12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property4.roundCeilingCopy();
        org.joda.time.Chronology chronology8 = property4.getChronology();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.weekyears();
        int int8 = durationField3.compareTo(durationField7);
        org.joda.time.DurationFieldType durationFieldType9 = durationField7.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField10 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType9);
        java.lang.String str11 = unsupportedDurationField10.getName();
        boolean boolean12 = unsupportedDurationField10.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = unsupportedDurationField10.getDifferenceAsLong(1712715962015L, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyears field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(unsupportedDurationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter1.parseMutableDateTime("-1");
        int int6 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "", (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser9);
        org.joda.time.DateTime dateTime12 = dateTimeFormatter10.parseDateTime("21");
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        boolean boolean10 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime9.getDayOfWeek();
        int int12 = dateTime9.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay13 = dateTime9.toTimeOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight18 = dateTime17.toDateMidnight();
        org.joda.time.DateTime dateTime20 = dateTime17.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTimeISO();
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone28.getShortName((long) '#', locale30);
        org.joda.time.Chronology chronology32 = gregorianChronology26.withZone(dateTimeZone28);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone28.getOffset(readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean38 = dateTimeZone36.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone36.isLocalDateTimeGap(localDateTime39);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone36.getName(1712715987735L, locale42);
        long long45 = dateTimeZone28.getMillisKeepLocal(dateTimeZone36, (long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime9.toMutableDateTime(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-00:00:00.001" + "'", str31, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-00:00:00.001" + "'", str43, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNotNull(mutableDateTime46);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.ReadablePartial readablePartial36 = null;
        int int37 = dividedDateTimeField29.getMinimumValue(readablePartial36);
        int int38 = dividedDateTimeField29.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.IllegalFieldValueException illegalFieldValueException43 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType39, (java.lang.Number) (byte) 11, (java.lang.Number) (short) 0, (java.lang.Number) (short) 100);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField44 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField29, dateTimeFieldType39);
        long long46 = remainderDateTimeField44.remainder((long) 100);
        org.joda.time.DurationField durationField47 = remainderDateTimeField44.getRangeDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(durationField47);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = gregorianChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology17.secondOfMinute();
        boolean boolean23 = dateTimeField21.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str25 = dateTimeFieldType24.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField26 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField21, dateTimeFieldType24);
        long long28 = zeroIsMaxDateTimeField26.roundFloor((long) 100);
        long long30 = zeroIsMaxDateTimeField26.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = zeroIsMaxDateTimeField26.getAsText(readablePartial31, (int) (byte) 7, locale33);
        int int35 = zeroIsMaxDateTimeField26.getMinimumValue();
        int int38 = zeroIsMaxDateTimeField26.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.monthOfYear();
        org.joda.time.ReadablePartial readablePartial43 = null;
        int[] intArray44 = new int[] {};
        int int45 = dateTimeField42.getMaximumValue(readablePartial43, intArray44);
        int int46 = zeroIsMaxDateTimeField26.getMinimumValue(readablePartial39, intArray44);
        int int47 = zeroIsMaxDateTimeField9.getMinimumValue(readablePartial16, intArray44);
        int int48 = zeroIsMaxDateTimeField9.getMaximumValue();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "centuryOfEra" + "'", str25, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 999L + "'", long30 == 999L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "7" + "'", str34, "7");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12 + "'", int45 == 12);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = dateTime9.toDateMidnight();
        boolean boolean11 = readableInterval1.contains((org.joda.time.ReadableInstant) dateMidnight10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = gregorianChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) '#', locale8);
        int int11 = dateTimeZone6.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone12 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone6);
        org.joda.time.Chronology chronology13 = gregorianChronology1.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology1.era();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter1.parseMutableDateTime("-1");
        int int6 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "", (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay16 = dateTime15.toTimeOfDay();
        boolean boolean17 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay16);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter7.printTo(stringBuffer11, (org.joda.time.ReadablePartial) timeOfDay16, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology9.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, dateTimeFieldType13, (int) (byte) 7, 3, 0);
        int int18 = offsetDateTimeField17.getMaximumValue();
        int int20 = offsetDateTimeField17.getMaximumValue((-99979L));
        int int23 = offsetDateTimeField17.getDifference(12L, (long) '4');
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay28 = dateTime27.toTimeOfDay();
        boolean boolean29 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology30.monthOfYear();
        org.joda.time.DurationField durationField33 = gregorianChronology30.hours();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology30.secondOfMinute();
        boolean boolean36 = dateTimeField34.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str38 = dateTimeFieldType37.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField39 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField34, dateTimeFieldType37);
        org.joda.time.ReadablePartial readablePartial40 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology41 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology41.monthOfYear();
        org.joda.time.DurationField durationField44 = gregorianChronology41.hours();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology41.secondOfMinute();
        boolean boolean47 = dateTimeField45.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str49 = dateTimeFieldType48.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField50 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField45, dateTimeFieldType48);
        long long52 = zeroIsMaxDateTimeField50.roundFloor((long) 100);
        long long54 = zeroIsMaxDateTimeField50.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = null;
        java.lang.String str58 = zeroIsMaxDateTimeField50.getAsText(readablePartial55, (int) (byte) 7, locale57);
        int int59 = zeroIsMaxDateTimeField50.getMinimumValue();
        int int62 = zeroIsMaxDateTimeField50.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial63 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology64 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField65 = gregorianChronology64.dayOfYear();
        org.joda.time.DateTimeField dateTimeField66 = gregorianChronology64.monthOfYear();
        org.joda.time.ReadablePartial readablePartial67 = null;
        int[] intArray68 = new int[] {};
        int int69 = dateTimeField66.getMaximumValue(readablePartial67, intArray68);
        int int70 = zeroIsMaxDateTimeField50.getMinimumValue(readablePartial63, intArray68);
        int int71 = dateTimeField34.getMinimumValue(readablePartial40, intArray68);
        int int72 = offsetDateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay28, intArray68);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = property4.compareTo((org.joda.time.ReadablePartial) timeOfDay28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(gregorianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "centuryOfEra" + "'", str38, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "centuryOfEra" + "'", str49, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 999L + "'", long54 == 999L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "7" + "'", str58, "7");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 12 + "'", int69 == 12);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 8 + "'", int72 == 8);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = gregorianChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) '#', locale8);
        int int11 = dateTimeZone6.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone12 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone6);
        org.joda.time.Chronology chronology13 = gregorianChronology1.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        java.util.Locale locale1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        java.lang.String str4 = dateTimeFormatter0.print((long) (-11));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969365T155959-0800" + "'", str4, "1969365T155959-0800");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        java.util.Locale locale5 = null;
        int int6 = dateTimeField4.getMaximumShortTextLength(locale5);
        boolean boolean7 = dateTimeField4.isSupported();
        java.lang.String str9 = dateTimeField4.getAsText((long) (byte) 21);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71" + "'", str9, "71");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        java.lang.String str11 = zeroIsMaxDateTimeField9.getAsShortText((long) (short) 1);
        boolean boolean13 = zeroIsMaxDateTimeField9.isLeap((long) (byte) 11);
        int int16 = zeroIsMaxDateTimeField9.getDifference(100L, 0L);
        boolean boolean17 = zeroIsMaxDateTimeField9.isSupported();
        long long20 = zeroIsMaxDateTimeField9.add((long) (byte) -1, 1712715979971L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "60" + "'", str11, "60");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1712715979970999L + "'", long20 == 1712715979970999L);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter0.parseLocalDate("org.joda.time.IllegalFieldValueException: Value 1712715991341 for era is not supported: GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"org.joda.time.IllegalFieldValueE...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusYears(0);
        long long4 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long12 = zeroIsMaxDateTimeField9.add(12L, (long) (byte) 1);
        org.joda.time.DurationField durationField13 = zeroIsMaxDateTimeField9.getDurationField();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = zeroIsMaxDateTimeField9.getMaximumValue(readablePartial14);
        int int16 = zeroIsMaxDateTimeField9.getMaximumValue();
        long long19 = zeroIsMaxDateTimeField9.getDifferenceAsLong(97L, 1712716008010L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1012L + "'", long12 == 1012L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1712716007L) + "'", long19 == (-1712716007L));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = gregorianChronology0.days();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.remainder((long) 1);
        long long17 = zeroIsMaxDateTimeField9.roundCeiling(1712715991341L);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.monthOfYear();
        org.joda.time.DurationField durationField21 = gregorianChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology18.centuryOfEra();
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay27 = dateTime26.toTimeOfDay();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) timeOfDay27, 99, locale29);
        int int31 = zeroIsMaxDateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay27);
        java.lang.String str32 = zeroIsMaxDateTimeField9.getName();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712715992000L + "'", long17 == 1712715992000L);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "99" + "'", str30, "99");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "centuryOfEra" + "'", str32, "centuryOfEra");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField6 = gregorianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter0.withOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int6 = dateMidnight4.get(dateTimeFieldType5);
        java.lang.String str7 = dateTimeFieldType5.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "halfdayOfDay" + "'", str7, "halfdayOfDay");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.millisOfSecond();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology7.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField15 = new org.joda.time.field.OffsetDateTimeField(dateTimeField10, dateTimeFieldType11, (int) (byte) 7, 3, 0);
        int int16 = offsetDateTimeField15.getMaximumValue();
        int int18 = offsetDateTimeField15.getMaximumValue((-99979L));
        org.joda.time.DurationField durationField19 = offsetDateTimeField15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = gregorianChronology22.weeks();
        int int26 = durationField23.getValue((long) (short) 10, (long) 10);
        long long28 = durationField23.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField29 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType20, durationField23);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField31 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField15, dateTimeFieldType20, (int) (byte) 21);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType20, (int) (byte) 21);
        int int35 = remainderDateTimeField33.get(10L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "centuryOfEra" + "'", str21, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        int int37 = dividedDateTimeField29.get((-202387856L));
        long long39 = dividedDateTimeField29.roundHalfCeiling((long) 2);
        int int42 = dividedDateTimeField29.getDifference(97000L, (long) 32);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 57000L + "'", long39 == 57000L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField9.set(4016L, (int) (byte) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: centuryOfEra field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnsupportedDateTimeField" + "'", str11, "UnsupportedDateTimeField");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        boolean boolean10 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime9.getDayOfWeek();
        int int12 = dateTime9.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay13 = dateTime9.toTimeOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight18 = dateTime17.toDateMidnight();
        org.joda.time.DateTime dateTime20 = dateTime17.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTimeISO();
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime24);
        int int26 = dateTime24.getMillisOfDay();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        boolean boolean31 = readableInterval28.isAfter(readableInterval29);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        boolean boolean36 = readableInterval33.isAfter(readableInterval34);
        boolean boolean37 = readableInterval28.contains(readableInterval34);
        org.joda.time.Duration duration38 = readableInterval28.toDuration();
        org.joda.time.DateTime dateTime40 = dateTime24.withDurationAdded((org.joda.time.ReadableDuration) duration38, (int) '4');
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 57600999 + "'", int26 == 57600999);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("DateTimeField[era]");
        java.lang.String str2 = jodaTimePermission1.getActions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType4, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        java.lang.Number number12 = illegalFieldValueException11.getLowerBound();
        java.lang.Throwable[] throwableArray13 = illegalFieldValueException11.getSuppressed();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean8 = dateTime6.isAfter(1712716010216L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withDayOfYear(57600999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57600999 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = gregorianChronology3.equals((java.lang.Object) durationField10);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField12 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField10);
        org.joda.time.DurationField durationField13 = unsupportedDateTimeField12.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = unsupportedDateTimeField12.addWrapField(0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: yearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField12);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.Chronology chronology1 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundHalfCeiling((long) (byte) 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        java.util.Locale locale14 = null;
        java.lang.String str15 = offsetDateTimeField8.getAsShortText(readablePartial12, (int) (short) 100, locale14);
        int int17 = offsetDateTimeField8.getLeapAmount(1712715996281L);
        boolean boolean19 = offsetDateTimeField8.isLeap(1712716008010L);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = offsetDateTimeField8.set(10000L, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for era must be in the range [8,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        java.util.Locale locale9 = null;
        java.lang.String str10 = property4.getAsText(locale9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology11.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType15.getField((org.joda.time.Chronology) gregorianChronology16);
        org.joda.time.DurationField durationField18 = gregorianChronology16.weeks();
        boolean boolean19 = gregorianChronology11.equals((java.lang.Object) durationField18);
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.monthOfYear();
        org.joda.time.DurationField durationField23 = gregorianChronology20.hours();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology20.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean29 = dateTimeZone27.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone27.isLocalDateTimeGap(localDateTime30);
        java.lang.String str32 = dateTimeZone27.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone27, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.DateTimeUtils.getPeriodType(periodType37);
        org.joda.time.Period period39 = readableInterval36.toPeriod(periodType38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.PeriodType periodType43 = org.joda.time.DateTimeUtils.getPeriodType(periodType42);
        org.joda.time.Period period44 = readableInterval41.toPeriod(periodType43);
        org.joda.time.Period period45 = readableInterval36.toPeriod(periodType43);
        int[] intArray48 = gregorianChronology34.get((org.joda.time.ReadablePeriod) period45, (long) 100, (-202387856L));
        int[] intArray50 = gregorianChronology20.get((org.joda.time.ReadablePeriod) period45, (long) 4);
        int[] intArray53 = gregorianChronology11.get((org.joda.time.ReadablePeriod) period45, 1712715991341L, 70005000L);
        org.joda.time.DateTimeField dateTimeField54 = gregorianChronology11.weekyear();
        boolean boolean55 = property4.equals((java.lang.Object) dateTimeField54);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "69" + "'", str10, "69");
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gregorianChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-00:00:00.001" + "'", str32, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 0, 0, 0, 0, 0, 0, 4]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-54, -3, -1, -1, -6, -59, -46, -341]");
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minusHours((-100));
        int int7 = dateTime3.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        java.lang.String str6 = dateTimeField5.toString();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateTimeField[clockhourOfDay]" + "'", str6, "DateTimeField[clockhourOfDay]");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.String str2 = jodaTimePermission1.getActions();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField((org.joda.time.Chronology) gregorianChronology4);
        java.lang.String str6 = dateTimeFieldType3.toString();
        org.joda.time.IllegalFieldValueException illegalFieldValueException10 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType3, (java.lang.Number) 10L, (java.lang.Number) 100, (java.lang.Number) 1L);
        jodaTimePermission1.checkGuard((java.lang.Object) 10L);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField20 = new org.joda.time.field.OffsetDateTimeField(dateTimeField15, dateTimeFieldType16, (int) (byte) 7, 3, 0);
        org.joda.time.DurationField durationField21 = offsetDateTimeField20.getDurationField();
        boolean boolean22 = jodaTimePermission1.equals((java.lang.Object) offsetDateTimeField20);
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.monthOfYear();
        org.joda.time.DurationField durationField26 = gregorianChronology23.hours();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology23.secondOfMinute();
        boolean boolean29 = dateTimeField27.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str31 = dateTimeFieldType30.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField32 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField27, dateTimeFieldType30);
        long long34 = zeroIsMaxDateTimeField32.roundFloor((long) 100);
        long long36 = zeroIsMaxDateTimeField32.remainder((long) (byte) -1);
        java.lang.String str38 = zeroIsMaxDateTimeField32.getAsShortText(0L);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.monthOfYear();
        org.joda.time.DurationField durationField43 = gregorianChronology40.hours();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology40.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone47.isLocalDateTimeGap(localDateTime50);
        java.lang.String str52 = dateTimeZone47.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology54 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone47, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.PeriodType periodType58 = org.joda.time.DateTimeUtils.getPeriodType(periodType57);
        org.joda.time.Period period59 = readableInterval56.toPeriod(periodType58);
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.PeriodType periodType63 = org.joda.time.DateTimeUtils.getPeriodType(periodType62);
        org.joda.time.Period period64 = readableInterval61.toPeriod(periodType63);
        org.joda.time.Period period65 = readableInterval56.toPeriod(periodType63);
        int[] intArray68 = gregorianChronology54.get((org.joda.time.ReadablePeriod) period65, (long) 100, (-202387856L));
        int[] intArray70 = gregorianChronology40.get((org.joda.time.ReadablePeriod) period65, (long) 4);
        int int71 = zeroIsMaxDateTimeField32.getMaximumValue(readablePartial39, intArray70);
        boolean boolean72 = jodaTimePermission1.equals((java.lang.Object) readablePartial39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yearOfCentury" + "'", str6, "yearOfCentury");
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "centuryOfEra" + "'", str31, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 999L + "'", long36 == 999L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "60" + "'", str38, "60");
        org.junit.Assert.assertNotNull(gregorianChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-00:00:00.001" + "'", str52, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology54);
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 0, 0, 0, 4]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 60 + "'", int71 == 60);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        org.joda.time.DurationField durationField12 = offsetDateTimeField8.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = gregorianChronology15.weeks();
        int int19 = durationField16.getValue((long) (short) 10, (long) 10);
        long long21 = durationField16.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField22 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType13, durationField16);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField8, dateTimeFieldType13, (int) (byte) 21);
        long long26 = offsetDateTimeField8.remainder(10000L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "centuryOfEra" + "'", str14, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10000L + "'", long26 == 10000L);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        long long11 = zeroIsMaxDateTimeField9.roundFloor((long) 100);
        long long13 = zeroIsMaxDateTimeField9.remainder((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField9.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType20, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType20, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType20, (int) (byte) 19);
        long long32 = dividedDateTimeField29.addWrapField((-99994L), (int) (byte) 2);
        long long35 = dividedDateTimeField29.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        long long38 = dividedDateTimeField29.remainder((-61851226021989L));
        long long41 = dividedDateTimeField29.add((long) 1, (long) 31);
        long long43 = dividedDateTimeField29.roundHalfEven((long) (-100));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 999L + "'", long13 == 999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61994L) + "'", long32 == (-61994L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 266001L + "'", long35 == 266001L);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-61851226021989L) + "'", long38 == (-61851226021989L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 589001L + "'", long41 == 589001L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3000L) + "'", long43 == (-3000L));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.Chronology chronology5 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.DateTimeUtils.getPeriodType(periodType2);
        org.joda.time.Period period4 = readableInterval1.toPeriod(periodType3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.DateTimeUtils.getPeriodType(periodType7);
        org.joda.time.Period period9 = readableInterval6.toPeriod(periodType8);
        org.joda.time.Period period10 = readableInterval1.toPeriod(periodType8);
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(readableInterval11);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = gregorianChronology0.withUTC();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField8 = new org.joda.time.field.PreciseDurationField(durationFieldType6, (-99994L));
        org.joda.time.DurationFieldType durationFieldType9 = preciseDurationField8.getType();
        boolean boolean10 = gregorianChronology0.equals((java.lang.Object) durationFieldType9);
        org.joda.time.field.PreciseDurationField preciseDurationField12 = new org.joda.time.field.PreciseDurationField(durationFieldType9, 70003391L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gregorianChronology0.getDateTimeMillis(1326L, 18981, 2000, 69996, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18981 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 97005L, "DateTimeField[weekyear]");
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("1969-12-31T15:59:59.999/1969-12-31T15:59:59.999", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T15:59:59.999/1969-12-31T15:5...\" is malformed at \"-31T15:59:59.999/1969-12-31T15:5...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone3 = gregorianChronology0.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = gregorianChronology4.hours();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology4.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology13 = gregorianChronology4.withZone(dateTimeZone10);
        boolean boolean14 = dateTimeZone10.isFixed();
        org.joda.time.Chronology chronology15 = gregorianChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10, (int) (byte) 4);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(gregorianChronology17);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        boolean boolean6 = dateTimeField4.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField9 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField4, dateTimeFieldType7);
        java.lang.String str10 = dateTimeFieldType7.toString();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "centuryOfEra" + "'", str10, "centuryOfEra");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField6 = gregorianChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gregorianChronology1.getDateTimeMillis((int) 'a', (int) ' ', (int) (byte) 19, (int) (short) 10, 70, 70004043, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DurationField durationField10 = gregorianChronology8.weeks();
        boolean boolean11 = gregorianChronology3.equals((java.lang.Object) durationField10);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField12 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unsupportedDateTimeField12.isLeap((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: yearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField12);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear(200);
        org.joda.time.DateTime dateTime14 = dateTime7.withDurationAdded(57599999L, (-1));
        boolean boolean15 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}
